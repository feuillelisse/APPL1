/*
 * Nama             : Nisa Shadrina
 * NIM              : 191524053
 * Hari, Tanggal    : Senin, 22 Maret 2021
 */
package EnhancingaMovableCircle;

/**
 *
 * @author Nisa Shadrina
 */
// ****************************************************************** 
// MoveCircle.java 
// Uses CirclePanel to display a GUI that lets the user move 
// a circle by pressing buttons. 
// ****************************************************************** 
import java.awt.*; 
import javax.swing.*; 
public class MoveCircle{ 
    public static void main(String[] args){ 
        JFrame frame = new JFrame ("MoveCircle"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(400,300); 
        frame.getContentPane().add(new CirclePanel(400,300)); 
        frame.setVisible(true); 
    } 
} 