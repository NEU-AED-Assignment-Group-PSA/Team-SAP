/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Appointment;
import Business.AppointmentDirectory;
import Business.Bill;
import Business.BillDirectory;
import Business.Doctor;
import Business.DoctorDirectory;
import Business.Nurse;
import Business.NurseDirectory;
import Business.Operation;
import Business.OperationDirectory;
import Business.Patient;
import Business.PatientDirectory;

/**
 *
 * @author preranaurs
 */
public class CardiologyDept {
    
    
    BillDirectory billDirectory;
    DoctorDirectory doctorDirectory;
    AppointmentDirectory appointmentDirectory;
    NurseDirectory nurseDirectory;
    OperationDirectory operationDirectory; 
    Bed bed;
    PatientDirectory patientDirectory;
    
    public void getPatientHistory(Patient patient, AppointmentDirectory appointmnetList){
        //retrieve patient history
    }
    
     public void approveTreatment(Bill bill){
        // check advance payment status to initiate treatment
    }
     
    public void approveSurgery(Bill bill){
        // check advance payment status to initiate surgery
    }
    
    public void getAdmissionStatus(Patient patient){
        // returns discharged, on going or upcoming surgeries - status
    }
    
    public void initiateDeptBill(){
        // initiates dept specific bill
    }
    
    
}
