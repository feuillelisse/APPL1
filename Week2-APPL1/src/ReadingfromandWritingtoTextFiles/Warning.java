/*
 * Nama             : Nisa Shadrina
 * NIM              : 191524053
 * Hari, Tanggal    : Senin, 22 Maret 2021
 */
package ReadingfromandWritingtoTextFiles;

/**
 *
 * @author Nisa Shadrina
 */
// **************************************************************************** 
// Warning.java 
// Reads student data from a text file and writes data to another text file. 
// **************************************************************************** 
import java.util.Scanner; 
import java.io.*; 
public class Warning{ 
    // -------------------------------------------------------------------- 
    // Reads student data (name, semester hours, quality points) from a 
    // text file, computes the GPA, then writes data to another file 
    // if the student is placed on academic warning. 
    // -------------------------------------------------------------------- 
    public static void main (String[] args){ 
        int creditHrs; // number of semester hours earned 
        double qualityPts; // number of quality points earned 
        double gpa; // grade point (quality point) average
        String name;
        String inputName = "D:\\Github\\APPL1\\Week2-APPL1\\src\\ReadingfromandWritingtoTextFiles\\students.dat"; 
        String outputName = "D:\\Github\\APPL1\\Week2-APPL1\\src\\ReadingfromandWritingtoTextFiles\\warning.dat";
        Scanner scan;
        PrintWriter outFile;
        try{ 
            // Set up scanner to input file 
            scan = new Scanner(new File(inputName));
            // Set up the output file stream 
            outFile = new PrintWriter(new FileWriter(outputName));
            // Print a header to the output file 
            outFile.println("Students on Academic Warning\n");
            // Process the input file, one token at a time 
            while(scan.hasNext()){ 
                // Get the credit hours and quality points
                String[] line = scan.nextLine().split(" ");
                name = line[0];
                creditHrs = Integer.parseInt(line[1]); 
                qualityPts = Double.parseDouble(line[2]);
                // determine if the student is on warning
                // If so, write the student data to the output file.
                gpa = qualityPts / creditHrs;
                if(gpa < 1.5 && creditHrs < 30 || gpa < 1.75 && creditHrs < 60 || gpa < 2.0){
                    outFile.println(name + " " + creditHrs + " " + gpa);
                }
            } 
            // Close output file
            outFile.close();
        } 
        catch (FileNotFoundException exception){ 
            System.out.println ("The file " + inputName + " was not found."); 
        } 
        catch (IOException exception){ 
            System.out.println ("Something else goes wrong with the input or output stream."); 
        } 
        catch (NumberFormatException e){ 
            System.out.println ("Format error in input file: " + e);
        } 
    } 
}