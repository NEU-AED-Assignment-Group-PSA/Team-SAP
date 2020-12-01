/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Patient.Patient;
import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author preranaurs
 */
public class PatientHistoryDetails {
    private String medAlergies;
    private Patient patient;
    private String previousDiagnosis;
    private Person person;
    private Date createdOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getMedAlergies() {
        return medAlergies;
    }

    public void setMedAlergies(String medAlergies) {
        this.medAlergies = medAlergies;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPreviousDiagnosis() {
        return previousDiagnosis;
    }

    public void setPreviousDiagnosis(String previousDiagnosis) {
        this.previousDiagnosis = previousDiagnosis;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
