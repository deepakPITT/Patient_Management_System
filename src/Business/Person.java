/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Person {
    //Defining the Attributes for Person
    private String citizenID;
    private String firstName;
    private String lastName;
    private Patient patient;

    public Person(){
    patient = new Patient();
}
    
    //Defining Getter & Setter Methods to get and set the values
    
    // Getter & Setter for citizenID
    public String getCitizenID(){
        return citizenID;
    }
    public void setCitizenID(String citizenID){
        this.citizenID = citizenID;
    }
    
    // Getter & Setter for firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    // Getter & Setter for lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    // Getter & Setter for patient reference variable of class Patient
    public Patient getPatient(){
        return patient;
    }
    public void setPatient(Patient patient){
        this.patient = patient;
    }
    
    
    
    
    @Override
    public String toString(){
        return citizenID;
    }
}
