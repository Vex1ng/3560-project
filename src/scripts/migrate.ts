import { connection, query } from "@/utils/client";
import fs from "node:fs";
import { exit } from "node:process";
import ora from "ora";

const spinner = ora("Running migrations..");

const applyMigration = async (filename: string) => {
  spinner.text = `Applying ${filename}...`;
  try {
    const sql = fs.readFileSync(`./migrations/${filename}`).toString();
    await query(sql);
    await query(`INSERT INTO migrations (Name) VALUES ("${filename}")`);
  } catch (err) {
    console.log(err);
    await query("ROLLBACK");
    exit();
  }
};

const run = async () => {
  try {
    await query("SELECT Name from migrations");
  } catch (err) {
    spinner.text = "Creating migrations table...";
    await query(
      "CREATE TABLE migrations (Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, Name text NOT NULL, Timestamp timestamp DEFAULT CURRENT_TIMESTAMP)",
    );
  } finally {
    let rows = (await query(
      "SELECT Name from migrations; START TRANSACTION;",
    )) as any;
    rows = JSON.parse(JSON.stringify(rows));
    rows = rows.map((row: any) => row.Name);

    const migrations = fs.readdirSync("./migrations");

    for (const file of migrations) {
      if (!rows.includes(file)) {
        await applyMigration(file);
      }
    }

    await query("COMMIT");
    spinner.succeed("Database is up to date.");
    connection.end();
  }
};

run();
