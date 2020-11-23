/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Doctor.Doctor;
import Business.Lab.LabTest;
import Business.Operation.OperationDirectory;
import Business.Patient.Patient;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aditi
 */
public class Appointment {
    int appointmentId;
    String type; //online, in-person
    Date date;
    Doctor doctor;
    Patient patient;
    String status;  //booked, cancelled, rescheduled, completed
    String location;
    OperationDirectory operationDirectory;
    List<LabTest> labTestList;
    
    
    
    
    
}
