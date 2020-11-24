/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.PersonDirectory;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private String location;
    private WorkQueue workQueue;
    private PersonDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin"),
        //Doctor("Doctor"),
        Lab("Lab"),
        Dental("Dental Department"),
        ENT("ENT Department"),
        CovidCenter("Covid-19 Treatment Department"),
        MedicalStore("Medical Store Department"),
        BedManagement("Bed Management Department"),
        //Laundry("Laundry Service Department"),
        Pathology("Pathology Department"),
        Radiology("Radiology Department"),
        Inventory("Inventory Management Department"),
        UrgentCare("Urgent Care Department"),
        Cardiology("Cardiology Department"),
        Billing("Billing Department"),
        Other("Other Department");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        if(patientDirectory.getPatientList() == null){
            patientDirectory.setPatientList(new ArrayList<Patient>());
        }
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
