/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Branch { //Attributes
    private ArrayList <Customer> customers;
    private String name;

    public Branch(String name) { //Constructor
        customers= new ArrayList<>();
        this.name = name;
    }
    //Getters and Setters
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean addCustomer(Customer customer){ //Adding a Customer to our array
        if (findCustomer(customer.getName())==-1){ //with validation
           customers.add(customer);
            System.out.println("Customer successfully added");
            return true;
        }else{
            System.out.println("Customer already exists");
            return false;
        }
    }
    public boolean addCustomer(String name, double amount){ //Different parameters
        return addCustomer(new Customer(name,amount));
    }
    
    public int findCustomer(String name){ //Locating the position of a Customer
        for(int i=0; i<customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean addTransaction(String name, double transaction){ 
        int position=findCustomer(name); //Adding a transaction to a given customer
        if (position==-1){              //of a specific branch
            System.out.println("Imposible operation, customer doesnt exist");
            return false;
        }
        customers.get(position).addTransaction(transaction);
        System.out.println("Successful operation");
        return true;
    }
}