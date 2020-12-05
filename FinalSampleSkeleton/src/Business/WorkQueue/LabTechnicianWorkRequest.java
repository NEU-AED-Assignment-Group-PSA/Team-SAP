/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Appointment.Appointment;
import Business.Patient.Patient;

/**
 *
 * @author raunak
 */
public class LabTechnicianWorkRequest extends WorkRequest{
        /* inherited
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    
    
    */
    private Patient patient;
    private Appointment appointment;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    
    
    
}
