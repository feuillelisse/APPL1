/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchsort;

/**
 *
 * @author hp
 */
// **************************************************************** 
// FILE: IntegerList.java 
// 
// Purpose: Define an IntegerList class with methods to create, fill, 
// sort, and search in a list of integers. 
// 
// **************************************************************** 
import java.util.Scanner; 
public class IntegerList{ 
    int[] list; //values in the list 
    //------------------------------------------------------------ 
    // Constructor -- takes an integer and creates a list of that 
    // size. All elements default to value 0. 
    //------------------------------------------------------------ 
    public IntegerList(int size){
        list = new int[size];
    }
    //------------------------------------------------------------ 
    // randomize -- fills the array with randomly generated integers 
    // between 1 and 100, inclusive 
    //------------------------------------------------------------ 
    public void randomize(){ 
        int max = list.length; 
        for (int i=0; i<list.length; i++) 
            list[i] = (int)(Math.random() * max) + 1; 
    } 
    //------------------------------------------------------------ 
    // fillSorted -- fills the array with sorted values 
    //------------------------------------------------------------ 
    public void fillSorted(){
        for (int i=0; i<list.length; i++) 
            list[i] = i + 2; 
    } 
    //------------------------------------------------------------ 
    // print -- prints array elements with indices, one per line 
    //------------------------------------------------------------ 
    public String toString(){ 
        String s = ""; 
        for (int i=0; i<list.length; i++) 
        s += i + ":\t" + list[i] + "\n"; 
        return s; 
    } 
    //------------------------------------------------------------ 
    // linearSearch -- takes a target value and returns the index 
    // of the first occurrence of target in the list. Returns -1 
    // if target does not appear in the list 
    //------------------------------------------------------------ 
    public int linearSearch(int target){ 
        int location = -1; 
        for (int i=0; i<list.length && location == -1; i++) 
            if (list[i] == target)
                location = i; 
        return location; 
    }

    //------------------------------------------------------------ 
    // sortIncreasing -- uses selection sort 
    //------------------------------------------------------------ 
    public void sortIncreasing(){
        for (int i=0; i<list.length-1; i++){ 
            int minIndex = minIndex(list, i); 
            swap(list, i, minIndex); 
        } 
    }

    //------------------------------------------------------------ 
    // sortDecreasing -- uses selection sort 
    //------------------------------------------------------------     
    public void sortDecreasing(){
        int maxIndex; 
        for (int i = 0; i < list.length-1; i++){
            //find largest element in list starting at location i 
            maxIndex = i; 
            for (int j = i+1; j < list.length; j++) 
                if (list[j] > list[maxIndex]) 
                    maxIndex = j; 
                //swap list[i] with largest element 
                swap(list, i, maxIndex);
        }
    }

    public int minIndex(int[] list, int i) {
        int minIndex = i;
        for(int j = i + 1; j < list.length; j++){
            if(list[j] < list[minIndex]){
                minIndex = j;
            }
        }
        return minIndex;
    }

    public void swap(int[] list, int i, int index){
        int temp = list[i];
        list[i] = list[index]; 
        list[index] = temp; 
    }
    
    // Binary search "assuming the list is sorted in decreasing order"
    public int binarySearch(int target){
        int left = 0, right = this.list.length - 1;
        
        while(left <= right){
            int middle = left + (right - left) / 2; //mengarahkan index menjadi index di tengah
            
            // Melakukan cek apakah nilai di index tengah adalah nilai yang dicari atau bukan
            // Jika iya, maka return index nilai tersebut
            if(this.list[middle] == target){
                return middle;
            }
            // Melakukan cek apakah nilai di index tengah lebih besar dari nilai yang dicari atau bukan
            // Jika iya, maka index kiri di-assign index tengah + 1
            else if(this.list[middle] > target){
                left = middle + 1;
            }
            // Melakukan cek apakah nilai di index tengah lebih kecil dari nilai yang dicari atau bukan
            // Jika iya, maka index kanan di-assign index tengah - 1
            else if(this.list[middle] < target){
                right = middle - 1;
            }
        }
        // Jika tidak ditemukan, maka akan mengembalikan nilai -1
        return -1;
    }
}
