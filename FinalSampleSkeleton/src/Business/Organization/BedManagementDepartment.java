/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Bed.Bed;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Bed.BedDirectory;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aditi
 */
public class BedManagementDepartment extends Organization {

    
    private BedDirectory bedList;
    private int bedCount;
    private Map<Date,Bed> assignedBedMap;

    public Map<Date, Bed> getAssignedBedMap() {
        return assignedBedMap;
    }

    public void setAssignedBedMap(Map<Date, Bed> assignedBedMap) {
        this.assignedBedMap = assignedBedMap;
    }
    

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
        
        assignedBedMap = new HashMap<>();
        
        
    }
    
    
    public void assignBedOnDate(Date date, Bed bed)
    {
       assignedBedMap.put(date,bed);
    }
    
    public boolean checkIfBedAvailbleOnDate(Date date, Bed bed){
        
        for (Map.Entry<Date, Bed> entry : assignedBedMap.entrySet()) {
        Date k = entry.getKey();
        Bed v = entry.getValue();
        
        if(k.equals(date) && v.equals(bed) && bed.getStatus()!= Bed.BedStatus.Available)
        {
            return false;
        }
        
        System.out.println("Key: " + k + ", Value: " + v);
    }
        
        
        //return true if entry is not present
        return true;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
}
