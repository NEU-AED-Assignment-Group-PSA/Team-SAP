/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Department.Department;
import java.util.List;

/**
 *
 * @author aditi
 */
public class DoctorDirectory {
    List<Doctor> doctorList;

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    
    
    public Doctor searchDoctorById(int id){
        for(Doctor doctor : doctorList){
            if(doctor.getId() == id ){
               return doctor; 
            }
        }
        return null;
    }
    
    List<Doctor> viewDoctorList(){
        List<Doctor> doctorList=null;
        
        
        return doctorList;
    }
    
    public void deleteDoctor(Doctor doctor ){
       doctorList.remove(doctor); 
    }
    
    public void updateDoctor(int id, String specialization, String phoneNum, String location, String visitingCharge, Department department){
       for(Doctor doctor: doctorList){
            if(doctor.getId() == (id)){
                doctor.setSpecialization(specialization);
                doctor.setPhoneNum(phoneNum);
                doctor.setLocation(location);
                doctor.setVisitingCharge(Double.parseDouble(visitingCharge));
                doctor.setDepartment(department);
            }
        } 
    }
    
    public Doctor createDoctor(){
        //create a new doctor object, add to directory and send
        Doctor doctor= new Doctor();
        doctorList.add(doctor);
        return doctor;
    }
    
    
    
    
    
    
    
    
    
}
