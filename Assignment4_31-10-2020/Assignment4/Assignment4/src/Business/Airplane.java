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
public class Airplane {
    private String airplaneName;
    private int windowSeatCount;  // passenger capacity
    private int middleSeatCount; 
    private int aisleSeatCount;
    //private String planeClass;
    //private List<Person> crew;
    //private double fuelCapacity;
    //private String model;
    private String modelNum;
    private List<Flight> flightList;
    //private Date nextMaintDate;
    //private List<FlightSchedule> flightSchedule;
    
    
    public Airplane(){
        //new Seat();
        flightList = new ArrayList<>();
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    
    public String getSerialNum() {
        return modelNum;
    }

    public void setSerialNum(String serialNum) {
        this.modelNum = serialNum;
    }
}
