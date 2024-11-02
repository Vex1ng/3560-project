package Skeleton;
public class Caller{

    private int callerID; // caller ID
    private String firstName; // first name of caller
    private String lastName; // last name of caller
    private String address; // address of caller
    private int phoneNumber; // phone number/contact info of caller

    // creates a Caller object and defines all variables above
    public Caller(int callerID, String firstName, String lastName, String address, int phoneNumber) {

        this.callerID = callerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address; 
        this.phoneNumber = phoneNumber;

    }

    // sets the Caller ID
    public void setCallerID(int newCallerID) {

        callerID = newCallerID;

    }

    // sets the first name of the caller
    public void setFirstName(String newFirstName) {
        
        firstName = newFirstName;

    }

    // sets the last name of the caller
    public void setLastName(String newLastName) {

        lastName = newLastName;

    }

    // sets the address of the caller
    public void setAddress(String newAddress) {

        address = newAddress;

    }

    // sets the phone number of the caller
    public void setPhoneNumber(int newPhoneNumber) {

        phoneNumber = newPhoneNumber;

    }

}