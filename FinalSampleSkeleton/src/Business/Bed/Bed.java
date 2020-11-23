/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Bed;

/**
 *
 * @author aditi
 */
public class Bed {
    private int bedID;
    private BedType bedType;
    private Double price;
    private BedStatus status;
            
    public enum BedStatus{
        Available("Available"),
        Occupied("Occupied"),
        AssignedLaundry("Assigned Laundry");
        
        private String status;

        private BedStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "BedStatus{" + "status=" + status + '}';
        }
        
        
    }
    
    public enum BedType{
        Delux("Delux"),
        Normal("Normal");
        
        private String bedType;
        
        private BedType(String bedType){
            this.bedType = bedType;
        }

        public String getBedType() {
            return bedType;
        }

        public void setBedType(String bedType) {
            this.bedType = bedType;
        }

        @Override
        public String toString() {
            return "BedType{" + "bedType=" + bedType + '}';
        }
        
    }
}
