/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphicSorting;

import java.util.Scanner;

public class Strings {
    public static void main (String[] args){
        String[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many words do you want to sort? ");
        size = scan.nextInt()+1;
        strList = new String[size];
        System.out.println ("\nEnter the words...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.nextLine();
            Sorting.insertionSort(strList);
            System.out.println ("\nYour words in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
            System.out.println();
    }
}
