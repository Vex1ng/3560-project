package Skeleton;
public class PriorityQueue {

    private int queueID; // Key for the Priority Queue
    private int incidentID; // Key for the associated incident
    private int priorityLevel; // Representation of the priority of this incident 
    private int timeAdded; // Time incident was added
    private String status; // available / assigned

    // Creates a PriorityQueue object and defines all variables above
    public PriorityQueue(int queueID, int incidentID, int priorityLevel, int timeAdded, String status) {

        this.queueID = queueID;
        this.incidentID = incidentID;
        this.priorityLevel = priorityLevel;
        this.timeAdded = timeAdded;
        this.status = status;
    }

    // Sets the queue ID
    public void setQueueID(int newQueueID) {
        queueID = newQueueID;
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

    // Sets the status of the incident in the queue
    public void setStatus(String newStatus) {
        status = newStatus;
    }

    // Gets the queue ID
    public int getQueueID() {
        return queueID;
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

    // Gets the status of the incident in the queue
    public String getStatus() {
        return status;
    }

}