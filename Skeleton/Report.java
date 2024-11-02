package Skeleton;
public class Report {

    private int reportID; // key identifer for the report
    private int incidentID; // key identifier for the incident
    private String details; // classifies the details of the report
    private String submittedBy; // identifies who submitted the report
    private int timeStamp; // represetns the time stamp of the report

    // creates a a Report object and defines all variables above
    public Report(int reportID, int incidentID, String details, String submittedBy, int timeStamp) {

        this.reportID = reportID;
        this.incidentID = incidentID;
        this.details = details;
        this.submittedBy = submittedBy;
        this.timeStamp = timeStamp; 

    }
    
    // sets the report ID
    public void setReportID(int newReportID) {
        reportID = newReportID;
    }

    // sets the incident ID
    public void setIncidentID(int newIncidentID) {
        incidentID = newIncidentID;
    }

    // sets the details of the report
    public void setDetails(String newDetails) {
        details = newDetails;
    }

    // sets the name of the person who submitted the report
    public void setSubmittedBy(String newSubmittedBy) {
        submittedBy = newSubmittedBy;
    }

    // sets the timestamp of the report
    public void setTimeStamp(int newTimeStamp) {
        timeStamp = newTimeStamp;
    }

    // gets the report ID
    public int getReportID() {
        return reportID;
    }

    // gets the incident ID
    public int getIncidentID() {
        return incidentID;
    }

    // gets the details of the report
    public String getDetails() {
        return details;
    }

    // gets the name of the person who submitted the report
    public String getSubmittedBy() {
        return submittedBy;
    }

    // gets the timestamp of the report
    public int getTimeStamp() {
        return timeStamp;
    }
    
}
