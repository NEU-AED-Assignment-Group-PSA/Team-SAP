/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Bill;
import Business.Location;
import Business.Patient;
import Business.Receptionist;
import java.util.Date;

/**
 *
 * @author preranaurs
 */
public class AdmissionDept {
    Receptionist receptionist;
    String admissionId;
    Bed bed;
    Patient patient;
    Bill bill;
    Date joiningDate;
    Location location;
}
