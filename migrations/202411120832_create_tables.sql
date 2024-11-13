-- This database is designed to manage and store information for the dispatch system
CREATE DATABASE IF NOT EXISTS dispatch_system;

-- table designated to storing caller information
CREATE TABLE callers (
    caller_ID INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    address VARCHAR(250),
    phone_number VARCHAR(15)
);

-- table designated to storing incident information
CREATE TABLE incidents (
    incident_ID INT AUTO_INCREMENT PRIMARY KEY,
    caller_ID INT,
    description TEXT NOT NULL,
    priority ENUM('Low', 'Medium', 'High', 'Critical') NOT NULL,
    status ENUM('Pending', 'In Progress', 'Resolved') DEFAULT 'Pending',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (caller_ID) REFERENCES callers(caller_ID)
);

-- table designated to storing dispatch records
CREATE TABLE dispatch (
    dispatch_ID INT AUTO_INCREMENT PRIMARY KEY,
    incident_ID INT,
    department ENUM('Police', 'Fire', 'Medical') NOT NULL,
    unit_assigned VARCHAR(50),
    backup_needed BOOLEAN DEFAULT FALSE,
    report TEXT,
    dispatched_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (incident_ID) REFERENCES incidents(incident_ID)
);