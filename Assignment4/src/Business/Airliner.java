/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author aditi
 */
public class Airliner {
    private String airLinerName;
    private String rating;
    private String shareRate;
    
    private List<Airplane> airplaneList;
    //private List<Flight> flightList;

    public Airliner(){
    airplaneList=new ArrayList<>();
        
}
    
    
    public String getAirLinerName() {
        return airLinerName;
    }

    public void setAirLinerName(String airLinerName) {
        this.airLinerName = airLinerName;
    }

    
}
