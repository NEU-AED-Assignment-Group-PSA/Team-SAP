/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Operation.Operation;
import Business.Patient.Patient;

/**
 *
 * @author raunak
 */
public class NurseWorkRequest extends WorkRequest{
    /* 
    inherited->
    private String message;
    private UserAccount sender;--> from doctor
    private UserAccount receiver; -->> to nurse
    private String status;  -> new, assigned, complete
    private Date requestDate;
    private Date resolveDate;
    */
    private String testResult;
    private Operation operation;
    private Patient patient;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
