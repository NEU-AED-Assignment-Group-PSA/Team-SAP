/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.List;

/**
 *
 * @author aditi
 */
public class Patient extends Person{
    
    String phoneNum;
    AppointmentDirectory appointmentList;
    LabTestDirectory labTestList;
    
    
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
