/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.LabTest;
import Business.Location;
import Business.MedicineDirectory;
import Business.Prescription;
import java.util.List;

/**
 *
 * @author preranaurs
 */
public class MedicalStoreDept {
    List <MedicineDirectory> medicineList;
    String pharmacistName;
    Location location;
    Prescription prescription;
    
    public void generateBill(Prescription prescription){
       //generates bill for medicines bought at the store
    }
}
