/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.Scanner;
// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************
public class WeeklySales{
    public static void main(String[] args){
        Salesperson[] salesStaff;
        String[] firstName;
        String[] lastName;
        int salesAmt;
        int size;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many salesperson do you want to input? ");
        size = scan.nextInt();
        salesStaff = new Salesperson[size];
        firstName = new String[size];
        lastName = new String[size];
        
        System.out.print("\nEnter the salesperson data : ");
        for (int i = 0; i < size; i++){
            System.out.print("\nFirst Name : ");
            firstName[i] = scan.next();
            System.out.print("Last Name : ");
            lastName[i] = scan.next();
            System.out.print("Total Sales this week : ");
            salesAmt = scan.nextInt();
            salesStaff[i] = new Salesperson(firstName[i], lastName[i], salesAmt);
        }
        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}