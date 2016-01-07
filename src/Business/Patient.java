/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Patient {
    //Defining the Attributes for the Patient
    private int patientAge;
    private int patientID; 
    private String doctorLastName;
    private String doctorFirstName;
    private String pharmacyName;
    private VitalSignHistory vitalSignHistory;

    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    
   
    //Getter & Setter Methods for patientAge
    public int getPatientAge(){
        return patientAge;
    }
    public void setPatientAge(int patientAge){
        this.patientAge = patientAge;
    }
    
    // Getter & Setter for PatientID
    public int getPatientID(){
        return patientID;
    }
    public void setPatientID(int patientID){
        this.patientID = patientID;
    }
    
    // Getter & Setter for DoctorLastName
    public String getDoctorLastName(){
        return doctorLastName;
    }
    public void setDoctorLastName(String doctorLastName){
        this.doctorLastName = doctorLastName;
    }
    
    // Getter & Setter for DoctorFirstName
    public String getDoctorFirstName(){
        return doctorFirstName;
    }
    public void setDoctorFirstName(String doctorFirstName){
        this.doctorFirstName = doctorFirstName;
    }
    
    // Getter & Setter for PharmacyName
    public String getPharmacyName(){
        return pharmacyName;
    }
    public void setPharmacyName(String pharmacyName){
        this.pharmacyName = pharmacyName;
    }
    
    // Getter & Setter for vitalSignHistory
    public VitalSignHistory getVitalSignHistory(){
        return vitalSignHistory;
    }
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory){
        this.vitalSignHistory = vitalSignHistory;
    }
   
}