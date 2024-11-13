# test table
CREATE TABLE test 
(
    ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    FirstName text NOT NULL,
    LastName text NOT NULL, 
    CreatedAt timestamp DEFAULT CURRENT_TIMESTAMP
)