/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// *******************************************************
package PolymorphicSorting;
import java.util.Objects;

// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// *******************************************************
public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;
     //------------------------------------------------------
     // Constructor: Sets up the sales person object with
     // the given data.
     //------------------------------------------------------
    public Salesperson (String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
     //-------------------------------------------
     // Returns the sales person as a string.
     //-------------------------------------------
    @Override
    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
     //-------------------------------------------
     // Returns true if the sales people have
     // the same name.
     //-------------------------------------------
    @Override
    public boolean equals(Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
    }
     //--------------------------------------------------
     // Order is based on total sales with the name
     // (last, then first) breaking a tie.
     //--------------------------------------------------
    @Override
    public int compareTo(Object other){
        int result;
        Salesperson sp = (Salesperson)other;
        if(this.totalSales > sp.totalSales)
            result = 1;
        else if(this.totalSales < sp.totalSales)
            result = -1;
        else
            if(this.firstName.compareTo(sp.firstName) == 0)
                result = this.lastName.compareTo(sp.lastName);
            else
                result = this.firstName.compareTo(sp.firstName);
        return result;
    }
  
     //-------------------------
     // First name accessor.
     //-------------------------
    public String getFirstName(){ 
        return firstName;
    }

     //-------------------------
     // Last name accessor.
     //-------------------------
    public String getLastName(){
        return lastName;
    }
     //-------------------------
     // Total sales accessor.
     //-------------------------
    public int getSales(){
        return totalSales;
    }
}