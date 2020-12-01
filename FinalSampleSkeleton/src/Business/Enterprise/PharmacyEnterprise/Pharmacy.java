/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.PharmacyEnterprise;

import Business.Department.DepartmentDirectory;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Medicine.MedicineDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author aditi
 */
public class Pharmacy extends Enterprise{
    //int id;
    //String name;
    Location location;
    Map<MedicineDirectory,Integer> medicineList;   /// medicine,quantity
    DepartmentDirectory departmentList;
    
    
    public Pharmacy(String name){
        super(name,EnterpriseType.Pharmacy);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
