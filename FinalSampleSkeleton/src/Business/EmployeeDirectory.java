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
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getEmployeeList() {
        return personList;
    }
    
    public Person createEmployee(String name){
        Person employee = new Person();
        employee.setName(name);
        personList.add(employee);
        return employee;
    }
}