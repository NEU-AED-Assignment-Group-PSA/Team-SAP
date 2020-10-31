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
    private String airlinerName;

    private String airplaneName;
    private int windowSeatCount;  // passenger capacity
    private int middleSeatCount; 
    private int aisleSeatCount;
    //private String planeClass;
    //private List<Person> crew;
    //private double fuelCapacity;
    //private String model;
    private String modelNum;
    //private List<Flight> flightList;
    //private Date nextMaintDate;
    //private List<FlightSchedule> flightSchedule;
    
    
    public Airplane(){
        //new Seat();
        //this.flightList = flightList;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public int getWindowSeatCount() {
        return windowSeatCount;
    }

    public void setWindowSeatCount(int windowSeatCount) {
        this.windowSeatCount = windowSeatCount;
    }

    public int getMiddleSeatCount() {
        return middleSeatCount;
    }

    public void setMiddleSeatCount(int middleSeatCount) {
        this.middleSeatCount = middleSeatCount;
    }

    public int getAisleSeatCount() {
        return aisleSeatCount;
    }

    public void setAisleSeatCount(int aisleSeatCount) {
        this.aisleSeatCount = aisleSeatCount;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    /*public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }*/

    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
     @Override
    public String toString(){
        return this.getAirplaneName();
    }
}
