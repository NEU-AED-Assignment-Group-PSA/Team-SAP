/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Location.LocationPoint;
import Business.UserAccount.UserAccount;
import java.util.List;

/**
 *
 * @author aditi
 */
public class PatientDirectory {
    private List<Patient> patientList;

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    
    

    public Patient createPatient(String patientName, String phoneNumber, String gender, String bloodGroup, UserAccount userAccount, LocationPoint locationPoint, String email) {
        Patient patient = new Patient();
        patient.setName(patientName);
        patient.setPhoneNum(phoneNumber);
        patient.setPatientSex(gender);
        //patient.setAddress(address);
        patient.setBloodGroup(bloodGroup);
        patient.setUserAccount(userAccount);
        patient.setAddress(locationPoint);
        patient.setRole("Patient Role");
        patient.setEmailID(email);
        patientList.add(patient);
        patient.createNewAppointmentDirectory();
        return patient;
    }

    public void updatePatient(int patientID, String name, String phoneNumber, String gender, String bloodGroup, LocationPoint locationPoint, String email) {
        for(Patient patient : patientList){
            if(patient.getId() == patientID){
                patient.setName(name);
                patient.setAddress(locationPoint);
                patient.setPatientSex(gender);
                patient.setPhoneNum(phoneNumber);
                patient.setBloodGroup(bloodGroup);
                patient.setEmailID(name);
            }
        }
    }
}
