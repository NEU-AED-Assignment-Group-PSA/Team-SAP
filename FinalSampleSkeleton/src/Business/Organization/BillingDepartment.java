/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Appointment;
import Business.Bill;
import Business.Doctor;
import Business.Patient;
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
    
    
   Bill processBilling(Date date){
      
       return bill;
   }
   
   public void generateInvoice(Date date, Patient patient){
       //generate invoice
   }
    
}
