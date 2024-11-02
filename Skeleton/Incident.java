package Skeleton;
public class Incident {

    private int incidentID; // key identifier for the incident
    private int callerID; // foreign key from caller
    private int reportID; // foreign key from report
    private String incidentType; // classifies the type of incidnet
    private int severity; // integer represetning the severity of the incident
    private String address; // physical address of the incident
    private String status; // classifies the status of the incident

    // creates an Incident object and defines all variables above
    public Incident(int incidentID, int callerID, int reportID, String incidentType, int severity, String address, String status) {

        this.incidentID = incidentID;
        this.callerID = callerID;
        this.reportID = reportID;
        this.incidentType = incidentType;
        this.severity = severity;
        this.address = address;
        this.status = status;

    }

    // sets the incident ID
    public void setIncidentID(int newIncidentID) {
        incidentID = newIncidentID;
    }

    // set the caller ID
    public void setCallerID(int newCallerID) {
        callerID = newCallerID;
    }

    // set report ID
    public void setReportID(int newReportID) {
        reportID = newReportID; 
    }

    // sets the incident type
    public void setIncidentType(String newIncidentType) {
        incidentType = newIncidentType;
    }

    // sets the severity level
    public void setSeverity(int newSeverity) {
        severity = newSeverity;
    }

    // sets the address of the incident
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    // sets the status of the incident
    public void setStatus(String newStatus) {
        status = newStatus;
    }

    // gets the incident ID
    public int getIncidentID() {
        return incidentID;
    }

    // get the caller ID
    public int getCallerID() {
        return callerID;
    }

    // get the reportID
    public int getReportID() {
        return reportID;
    }

    // gets the incident type
    public String getIncidentType() {
        return incidentType;
    }

    // gets the severity level
    public int getSeverity() {
        return severity;
    }

    // gets the address of the incident
    public String getAddress() {
        return address;
    }

    // gets the status of the incident
    public String getStatus() {
        return status;
    }

}
