/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Medicine.MedicineDirectory;
import Business.Doctor.Doctor;
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
    Date Date;
    Doctor doctor;
    Patient patient;
    private String history;

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

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
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
