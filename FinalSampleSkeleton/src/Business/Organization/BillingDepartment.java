/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Appointment.Appointment;
import Business.Bill.Bill;
import Business.Doctor.Doctor;
import Business.Patient.Patient;
import java.util.Date;

/**
 *
 * @author preranaurs
 */
public class BillingDepartment {
    String billingId;
    String billIssuer;
    Patient patient;
    Doctor doctor;
    Appointment appointment;
    Bill bill;
    String paymentStatus;
    String paymentMode;
    
    
   Bill processBilling(Date date){
      
       return bill;
   }
   
   public void generateInvoice(Date date, Patient patient){
       //generate invoice
   }
    
   public void selectPaymentMode(){
    //choose a payment mode
   }
}
