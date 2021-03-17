/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphicSorting;

// ******************************************************
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
// ******************************************************
import java.util.Scanner;
public class Numbers{
 // --------------------------------------------
 // Reads in an array of integers, sorts them,
 // then prints them in sorted order.
 // --------------------------------------------
    public static void main (String[] args){
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size]; //int[] cannot be converted to Comparable[], so, change it to Integer[]
        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();
            Sorting.insertionSort(intList); 
            System.out.println ("\nYour numbers in descending sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
            System.out.println();
    }
}

