/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Department.Department;
import Business.Employee.Employee;
import Business.Enterprise.LabEnterprise.Lab;
import Business.Enterprise.LabEnterprise.LabTest;
import Business.Patient.Patient;
import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author aditi
 */
public class Doctor extends Employee{
    //id, name from Person
    Department department;
    String specialization; // cardiologist, technician
    String phoneNum;
    String location;
    double visitingCharge;
    
    void prescribeMedicine(Patient patient){
        
    }
    
    void viewAppointments(Date d){
        
    }
    
    void viewPatientHistory(Patient patient)
    {
        
    }
    
    void scheduleSurgery(Patient patient){
        
    }
    
    void assignNextDoctor(Patient patient){
        //add a new appointment in patient's appointment list
    }
    
    void markForBilling(Patient patient){
        
    }
    
    void scheduleLabTest(Patient patient, LabTest test, Lab lab){
        
    }
    
}
