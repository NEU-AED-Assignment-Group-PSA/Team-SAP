/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Appointment.Appointment;
import Business.Appointment.AppointmentDirectory;
import Business.Bill.Bill;
import Business.Enterprise.LabEnterprise.LabTestDirectory;
import Business.Location.LocationPoint;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aditi
 */
public class Patient extends Person{
    
    String phoneNum;
    AppointmentDirectory appointmentDirectory;
    LabTestDirectory labTestList;
    String patientSex;
    //private String address;
    private LocationPoint address;
    private String bloodGroup;
    private UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public LocationPoint getAddress() {
        return address;
    }

    public void setAddress(LocationPoint address) {
        this.address = address;
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }

    public LabTestDirectory getLabTestList() {
        return labTestList;
    }

    public void setLabTestList(LabTestDirectory labTestList) {
        this.labTestList = labTestList;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }
    
    
    
    void bookAppointment(Appointment app )
    {
        
    }
    
    Appointment viewAppointment(Date date){
        Appointment app=null;
        return app;
    }
    
    void rescheduleAppointment(Appointment app )
    {
        //update the appointment
        //
    }
    
    Bill viewBills(Appointment app){
      Bill b=null;
      
      return b;
    }
}
