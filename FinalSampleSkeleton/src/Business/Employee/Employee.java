/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private double visitingCharge;
    private String phoneNum;
    private String emailID;
    private String role;
    private String carrier;

   
    //private double visitingCharge;
    private SpecializationType specialization;

    public SpecializationType getSpecialization() {
        return specialization;
    }

    public void setSpecialization(SpecializationType specialization) {
        this.specialization = specialization;
    }

    
     public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public double getVisitingCharge() {
        return visitingCharge;
    }

    public void setVisitingCharge(double visitingCharge) {
        this.visitingCharge = visitingCharge;
    }

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    public enum SpecializationType{
        MBBS("MBBS"),
        Surgeon("Surgeon"),
        MD("MD"),
        Physician("Physician");
        
        private String value;
        private SpecializationType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
}
