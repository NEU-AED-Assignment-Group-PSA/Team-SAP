/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Doctor;
import Business.Location;
import Business.Receptionist;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class Clinic extends Enterprise{
    Doctor doctor;
    Location location;
    Receptionist receptionist;
    
    
    
    public Clinic(String name){
        super(name,EnterpriseType.Clinic);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
