/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Appointment.Appointment;
import Business.Doctor.Doctor;
import Business.Lab.LabTest;
import Business.Patient.Patient;

/**
 *
 * @author preranaurs
 */
public class LabTestReportDept {
    Doctor doctor;
    LabTest labTest;
    Appointment appointment;
    Patient patient;
    
    public void generateReport(LabTest labtest){
    //generates the given lab report     
    }
    
    public void generateBill(LabTest labTest){
       //generates bill for Lab tests conducted 
    }
}
