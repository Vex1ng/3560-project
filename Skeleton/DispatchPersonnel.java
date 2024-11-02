package Skeleton;

public class DispatchPersonnel {

    private int personnelID; // key identifier for the personnel
    private String firstName; // first name of the personnel
    private String lastName; // last name of the personnel
    private String department; // name of department
    private String position; // name of position

    // creates a DispatchPersonnel object and defines all variables above
    public DispatchPersonnel(int personnelID, String firstName, String lastName, String department, String position) {

        this.personnelID = personnelID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;

    }

    // sets the personnel ID
    public void setPersonnelID(int newPersonnelID) {
        personnelID = newPersonnelID;
    }

    // sets the first name of the personnel
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    // sets the last name of the personnel
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    // sets the department of the personnel
    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    // sets the position of the personnel
    public void setPosition(String newPosition) {
        position = newPosition;
    }

    // gets the personnel ID
    public int getPersonnelID() {
        return personnelID;
    }

    // gets the first name of the personnel
    public String getFirstName() {
        return firstName;
    }

    // gets the last name of the personnel
    public String getLastName() {
        return lastName;
    }

    // gets the department of the personnel
    public String getDepartment() {
        return department;
    }

    // gets the position of the personnel
    public String getPosition() {
        return position;
    }

}
