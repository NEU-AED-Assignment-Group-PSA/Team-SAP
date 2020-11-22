/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author aditi
 */
public class Bill {
    //cumulative charges->> labs, medicine, consultation, hospital charges
    int billId;
    Patient patient;
    Doctor doctor;
    Appointment appointment;
    double totalCharges;
    String status;//paid, unpaid
    int invoiceNumber;
    
    
    
}
