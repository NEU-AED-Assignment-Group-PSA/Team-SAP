/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class BedManagementDepartment extends Organization {

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
