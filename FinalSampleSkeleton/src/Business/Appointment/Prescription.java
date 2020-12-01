/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Medicine.MedicineDirectory;
import Business.Doctor.Doctor;
import Business.Employee.Employee;
import Business.Enterprise.LabEnterprise.LabTestDirectory;
import Business.Patient.Patient;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aditi
 */
public class Prescription {
    LabTestDirectory labTestList;
    MedicineDirectory medicineList;
    private Date createdOn;
    Employee doctor;
    Patient patient;
    private String history;

    public Prescription() {
        this.createdOn = new Date();
    }

    
    public LabTestDirectory getLabTestList() {
        return labTestList;
    }

    public void setLabTestList(LabTestDirectory labTestList) {
        this.labTestList = labTestList;
    }

    public MedicineDirectory getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(MedicineDirectory medicineList) {
        this.medicineList = medicineList;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

   
    

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
    
    
    
    
}
