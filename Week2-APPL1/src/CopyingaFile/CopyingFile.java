/*
 * Nama             : Nisa Shadrina
 * NIM              : 191524053
 * Hari, Tanggal    : Senin, 22 Maret 2021
 * Deskripsi        : Program dapat membaca sebuah file.
 */
package CopyingaFile;

/**
 *
 * @author Nisa Shadrina
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CopyingFile {
    public static void main(String[] args){
        Scanner filename = new Scanner(System.in);
        Scanner input = null;
        boolean found = false;
        File file;
        
        while(!found){
            /*Memasukan nama file*/
            System.out.println("Masukan address file : ");
            file = new File(filename.nextLine());
            /*Mencari apakah file ditemukan atau tidak*/
            try{
                input = new Scanner(file);
                found = true;
            }catch(FileNotFoundException nf){
                System.out.println("File tidak ditemukan");
            }
        }
        
        /*Membaca dan print isi file*/
        System.out.println("Membaca isi file ... \n");
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
    }
}