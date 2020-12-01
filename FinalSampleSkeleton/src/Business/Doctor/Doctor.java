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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getVisitingCharge() {
        return visitingCharge;
    }

    public void setVisitingCharge(double visitingCharge) {
        this.visitingCharge = visitingCharge;
    }
    
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
