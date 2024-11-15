import Card from "./components/Card";
import Dropdown from "./components/Dropdown";
import StatCard from "./components/StatCard";

export default function Home() {
  return (
    <>
      <div className="flex flex-col pt-[30px] gap-y-[30px]">
        <Dropdown>
          <p className="underline">Past 24 hours</p>
        </Dropdown>
        <div className="flex flex-row justify-between">
          <StatCard title="Active Incidents" data={156} />
          <StatCard title="Available Units" data={100} />
          <StatCard title="Reports Submitted" data={30} />
        </div>
      </div>
    </>
  );
}
