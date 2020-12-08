/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Medicine.Medicine;
import Business.Patient.Patient;
import static com.db4o.foundation.Iterators.any;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class PharmacyWorkRequest extends WorkRequest{
        /* inherited
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    
    
    */
    private Patient patient;
    private Employee doctor;
    private Map<Medicine,Double> medicineMap;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Map<Medicine,Double> getMedicineMap() {
        return medicineMap;
    }

    public void setMedicineMap(Map<Medicine,Double> medicineMap) {
        this.medicineMap = medicineMap;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WorkRequest.count = count;
    }
    
    
}
