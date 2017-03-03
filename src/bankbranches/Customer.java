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
public class Customer { //Attributes
    private String name;
    private ArrayList<Double>transactions;

    public Customer(String name,double firstTrans) { //Constructor
        this.name = name;
        transactions = new ArrayList<>();
        this.transactions.add(firstTrans);
    }
    //Getters and Setters
    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
    
    public void addTransaction(double trans){ //Add a given amount to our transaction
        transactions.add(trans);            //compound
    }
    
    @Override 
    public String toString(){ //Function in case we need to transform data 
        return "Customer[name: "+this.name+", transactions: "+this.transactions;
    }
}