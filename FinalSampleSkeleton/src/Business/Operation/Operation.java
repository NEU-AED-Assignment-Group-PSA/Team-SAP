/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Operation;

import Business.Doctor.Doctor;
import Business.Patient.Patient;
import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class Operation {
    private String operationNumber;
    private String operationDate;
    private String operationDescription;
    private double operationCharge;
    private String status;
    private Patient patient;
    private Doctor doctor;//success, on-going, scheduled
    private Person person;

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public double getOperationCharge() {
        return operationCharge;
    }

    public void setOperationCharge(double operationCharge) {
        this.operationCharge = operationCharge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
}
