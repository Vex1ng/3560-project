package Skeleton;

public class Unit {

    private int unitID; // unique ID of the unit
    private int queueID; // queue ID of the unit
    private int personelID; // personel ID of the unit
    private String status; // current status of the unit 
    private String address; // current address of the unit
    private int assignedIncidentID; // ID of the incident this unit is assigned to

    // creates a Unit object and defines all variables above
    public Unit(int unitID, int queueID, int personelID, String status, String address) {
        this.unitID = unitID;
        this.queueID = queueID;
        this.personelID = personelID;
        this.status = status;
        this.address = address;
        this.assignedIncidentID = -1; // default to -1 when no incident is assigned
    }

    // gets the unit ID
    public int getUnitID() {
        return unitID;
    }

    // gets the queue ID
    public int getQueueID() {
        return queueID;
    }

     // gets the personel ID
    public int getPersonelID() {
        return personelID;
    }

    // gets the status of the unit
    public String getStatus() {
        return status;
    }

    // gets the address of the unit
    public String getaddress() {
        return address;
    }

    // gets the assigned incident ID
    public int getAssignedIncidentID() {
        return assignedIncidentID;
    }

    // sets the unit ID
    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    // sets the queue ID
    public void setQueueID(int queueID) {
        this.queueID = queueID;
    }

    // sets the personel ID
    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    // sets the status of the unit
    public void setStatus(String status) {
        this.status = status;
    }

    // sets the address of the unit
    public void setaddress(String address) {
        this.address = address;
    }

    // sets the assigned incident ID
    public void setAssignedIncidentID(int assignedIncidentID) {
        this.assignedIncidentID = assignedIncidentID;
    }

}
