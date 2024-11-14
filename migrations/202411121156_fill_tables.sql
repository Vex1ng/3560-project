USE dispatch_system;

-- Inserting mock data into callers table
INSERT INTO callers (caller_ID, first_name, last_name, address, phone_number)
VALUES (1, 'Billy', 'Joe', '3801 W Temple Ave, Pomona, CA 91768', '1234567890');

-- Inserting mock data into incidents table
INSERT INTO incidents (incident_ID, caller_ID, description, priority, status)
VALUES (1, 1, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'Medium', 'In Progress');

-- Inserting mock data into dispatch table
INSERT INTO dispatch (dispatch_ID, incident_ID, department, unit_assigned, backup_needed, report)
VALUES (1, 1, 'Police', 'Unit A1', FALSE, 'Officers dispatched to handle reported robbery');