-- This database is designed to manage + store information for the dispatch system 
CREATE DATABASE IF NOT EXISTS dispatch_system;

USE dispatch_system;

-- table designated to storing caller information
CREATE TABLE callers (

    -- serves as the primary key & gets incremented by 1 each time a row is added
    caller_ID INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    address VARCHAR(250),
    phone_number VARCHAR(15)

);

-- table designated to storing incident information 
CREATE TABLE incidents (

    -- serves as the primary key & gets incremented by 1 each time a row is added
    incident_ID INT AUTO_INCREMENT PRIMARY KEY,
    caller_ID INT,
    -- data type for description is TEXT to allow for large amoount of details
    description TEXT NOT NULL,
    -- predefined options for priority to ensure consistency
    priority ENUM('Low', 'Medium', 'High', 'Critical') NOT NULL,
    -- predifined options for status (default is pending)
    status ENUM('Pending', 'In Progress', 'Resolved') DEFAULT 'Pending',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (caller_ID) REFERENCES callers(caller_ID)

);

-- table designated to storing dispatch records
CREATE TABLE dispatch (

    -- serves as the primary key & gets incremented by 1 each time a row is added
    dispatch_ID INT AUTO_INCREMENT PRIMARY KEY,
    incident_ID INT,
    department ENUM('Police', 'Fire', 'Medical') NOT NULL,
    unit_assigned VARCHAR(50),
    -- backup is initially set to false 
    backup_needed BOOLEAN DEFAULT FALSE,
    report TEXT,
    dispatched_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (incident_ID) REFERENCES incidents(incident_ID)

);