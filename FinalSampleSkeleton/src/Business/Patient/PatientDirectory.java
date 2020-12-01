/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

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
    
    public void createPatient(){
        
    }

    public void createPatient(String patientName, String phoneNumber, String gender, String address, String bloodGroup, UserAccount userAccount) {
        Patient patient = new Patient();
        patient.setName(patientName);
        patient.setPhoneNum(phoneNumber);
        patient.setPatientSex(gender);
        patient.setAddress(address);
        patient.setBloodGroup(bloodGroup);
        patient.setUserAccount(userAccount);
        patientList.add(patient);
    }

    public void updatePatient(int patientID, String name, String phoneNumber, String gender, String address, String bloodGroup) {
        for(Patient patient : patientList){
            if(patient.getId() == patientID){
                patient.setName(name);
                patient.setAddress(address);
                patient.setPatientSex(gender);
                patient.setPhoneNum(phoneNumber);
                patient.setBloodGroup(bloodGroup);
            }
        }
    }
}
