/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.DepartmentDirectory;
import Business.DoctorDirectory;
import Business.Location;
import Business.NurseDirectory;
import Business.PatientDirectory;
import Business.Receptionist;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class Hospital extends Enterprise {
    int id;
    DoctorDirectory doctorList;
    NurseDirectory nurseList;
    Location location;
    DepartmentDirectory departmentList;
    PatientDirectory patientList;
    Receptionist receptionist;
    
    
    //String enterpriseType;
    public Hospital(String name){
        super(name,EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
