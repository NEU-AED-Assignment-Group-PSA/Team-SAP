/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;

/**
 *
 * @author aditi
 */
public class Customer extends Person {
    private String customerID;
    private String address;
    private String email;
    private String card;
    private List<Ticket> tickets;
    private String fName;
    private String lName;
    //private String role; //customer, crew, travelAgent
    private long moblieNum;
    //private String password;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public long getMoblieNum() {
        return moblieNum;
    }

    public void setMoblieNum(long moblieNum) {
        this.moblieNum = moblieNum;
    }
    
     
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
     
     
     
     public Customer()
     {
         super("Customer");
     }
    
    //
    
}
