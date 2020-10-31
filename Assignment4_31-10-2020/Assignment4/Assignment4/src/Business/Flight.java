/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aditi
 */
public class Flight {
    private String flightNum;
    private String flightName;
    //private int seatCount;
    
    private List<FlightSchedule> flightSchedule;

    
    public Flight(int seatCount){
       
       flightSchedule= new ArrayList<>();
    }
    
    
    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    
   
}
