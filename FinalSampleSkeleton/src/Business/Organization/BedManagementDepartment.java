/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Bed.BedDirectory;

/**
 *
 * @author aditi
 */
public class BedManagementDepartment extends Organization {

    
    BedDirectory bedList;
    int bedCount;

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public BedDirectory getBedList() {
        return bedList;
    }

    
    
    public void setBedList(BedDirectory bedList) {
        
        this.bedList = bedList;
    }
    
    
    public BedDirectory createBedList(int count){
        this.bedList = new BedDirectory(count);
        this.bedCount=count;
        return bedList;
    }
    
    public void addBedInBedList(int count){
        this.bedList.addBeds(count);
    }
    
    public BedManagementDepartment() {
        super(Organization.Type.BedManagement.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
}
