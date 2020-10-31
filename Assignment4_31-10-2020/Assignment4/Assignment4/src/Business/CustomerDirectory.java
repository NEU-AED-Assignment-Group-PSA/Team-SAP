/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;

/**
 *
 * @author aditi
 */
public class CustomerDirectory {
    private List<Customer> customerList;
    
    public void addCustomer(Customer c)
    {
        this.customerList.add(c);
    }
    
}
