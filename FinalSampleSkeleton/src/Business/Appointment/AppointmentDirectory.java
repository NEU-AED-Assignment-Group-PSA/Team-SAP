/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Patient.Patient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author aditi
 */
public class AppointmentDirectory {
    private int count = 1;
    List<Appointment> appointmentList;
    //private Prescription prescription;
    List<Prescription> prescriptionList;

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
    
    
    //update appointment
    
    void updateAppointment(Appointment app){
        
    }
    
    
    //cancel appointment
    void cancelAppointment(Appointment app){
        
    }
    
    //search Appointment by patient and date
    Appointment searchAppointment(Patient patient, Date date){
        Appointment app= null;
        
        
        
        
        return app;
    }
    
    
    //Return List of Appointments by patient
    List<Appointment> searchAppointment(Patient patient){
        List<Appointment> app= null;
        
        
        
        
        return app;
    }

    public void createAppointment(Patient patient, String doctor, Date appointmetDate, String appointmentType) {
       if(patient.getAppointmentDirectory()== null){
            AppointmentDirectory appointmentDirectory = new AppointmentDirectory();
            List<Appointment> appointmentList = new ArrayList<Appointment>();
            appointmentDirectory.setAppointmentList(appointmentList);
            patient.setAppointmentDirectory(appointmentDirectory);
        }
        
        Appointment appointment = new Appointment(count++);
        appointment.setDate(appointmetDate);
       // appointment.setDoctor(doctor);
        appointment.setType(appointmentType);
        appointment.setPatient(patient);
       
    }
    
    public Prescription addPrescription(){
        Prescription prescription = new Prescription();
        prescriptionList.add(prescription);
        return prescription;
    }
    
    
}
