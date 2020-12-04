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
    Map<MedicineDirectory,Integer> medicineListquanity;   /// medicine,quantity
    DepartmentDirectory departmentList;
    MedicineDirectory medicineList;

    public MedicineDirectory getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(MedicineDirectory medicineList) {
        this.medicineList = medicineList;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

   

    public DepartmentDirectory getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(DepartmentDirectory departmentList) {
        this.departmentList = departmentList;
    }
    
    
    public Pharmacy(String name){
        super(name,EnterpriseType.Pharmacy);
        medicineList = new MedicineDirectory();
        departmentList = new DepartmentDirectory();
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
