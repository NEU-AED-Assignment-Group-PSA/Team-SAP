/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aditi
 */

public class FlightSchedule {
    //private List<Schedule> schedule;
    //private List<Customer> customerList;
    private double price;  
    private String src ;  //source
    private String destination;
    private Date date;  //
    private List<Seat> seatList;
    private String time; //morning, evening, night
    
       
     public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
    
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public FlightSchedule(Flight flight)
    {
        //this.flight=flight;
        //schedule = new ArrayList<>();
       // customerList = new ArrayList<>();
        
    }
    
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    
}
