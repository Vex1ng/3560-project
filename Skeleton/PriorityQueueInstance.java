package Skeleton;
public class PriorityQueueInstance {

    private int queueID; // Key for the Priority Queue
    private int unitID; // Key for the assigned unit
    private int incidentID; // Key for the associated incident
    private int priorityLevel; // Representation of the priority of this incident
    private int timeAdded; // Time incident was added

    // Creates a PriorityQueueInstance object and defines all variables above
    public PriorityQueueInstance(int queueID, int unitID, int incidentID, int priorityLevel, int timeAdded) {
        this.queueID = queueID;
        this.unitID = unitID;
        this.incidentID = incidentID;
        this.priorityLevel = priorityLevel;
        this.timeAdded = timeAdded;
    }

    // Sets the queue ID
    public void setQueueID(int newQueueID) {
        queueID = newQueueID;
    }

    // Sets the unit ID
    public void setUnitID(int newUnitID) {
        unitID = newUnitID;
    }

    // Sets the incident ID
    public void setIncidentID(int newIncidentID) {
        incidentID = newIncidentID;
    }

    // Sets the priority level
    public void setPriorityLevel(int newPriorityLevel) {
        priorityLevel = newPriorityLevel;
    }

    // Sets the time the incident was added
    public void setTimeAdded(int newTimeAdded) {
        timeAdded = newTimeAdded;
    }

    // Gets the queue ID
    public int getQueueID() {
        return queueID;
    }

    // Gets the unit ID
    public int getUnitID() {
        return unitID;
    }

    // Gets the incident ID
    public int getIncidentID() {
        return incidentID;
    }

    // Gets the priority level
    public int getPriorityLevel() {
        return priorityLevel;
    }

    // Gets the time the incident was added
    public int getTimeAdded() {
        return timeAdded;
    }

}
