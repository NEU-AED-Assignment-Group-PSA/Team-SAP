/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Person> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Person> getEmployeeList() {
        return employeeList;
    }
    
    public Person createEmployee(String name){
        Person employee = new Person();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}