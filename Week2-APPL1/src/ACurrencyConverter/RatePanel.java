/*
 * Nama             : Nisa Shadrina
 * NIM              : 191524053
 * Hari, Tanggal    : Rabu, 23 Maret 2021
 */
package ACurrencyConverter;
/**
 *
 * @author Nisa Shadrina
 */
// ****************************************************************** 
// RatePanel.java 
// Panel for a program that converts different currencies to 
// U.S. Dollars 
// ****************************************************************** 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.EmptyBorder;
public class RatePanel extends JPanel{ 
    private double[] rate; // exchange rates 
    private String[] currencyName; 
    private JLabel result;
    JComboBox chooser;
    JTextField amount;
    // ------------------------------------------------------------ 
    // Sets up a panel to convert cost from one of 6 currencies 
    // into U.S. Dollars. The panel contains a heading, a text 
    // field for the cost of the item, a combo box for selecting 
    // the currency, and a label to display the result. 
    // ------------------------------------------------------------ 
    public RatePanel (){
        
        // Set the UI
        this.setBackground(new Color(255, 213, 214));
        this.setBorder(new EmptyBorder(20, 20, 0, 20));
        this.setLayout(new GridLayout(8, 8, 2, 2));
        
        // Title
        JLabel title = new JLabel ("How much is that in dollars?"); 
        title.setAlignmentX (Component.CENTER_ALIGNMENT); 
        title.setFont (new Font ("Helvetica", Font.BOLD, 20)); 
        
        // Set up the arrays for the currency conversions 
        currencyName = new String[] {"Select the currency..", 
                                    "European Euro", "Canadian Dollar", 
                                    "Japanese Yen", "Australian Dollar", 
                                    "Indian Rupee", "Mexican Peso"}; 
        rate = new double [] {0.0, 1.2103, 0.7351, 
                              0.0091, 0.6969, 
                              0.0222, 0.0880}; 
        result = new JLabel (" ------------ ");
        
        add(title, "North");
        add(result, "South");
        
        // Money Amount
        amount = new JTextField("0", 20);
        JLabel amtLabel = new JLabel("Enter the Amount : ");
        
        add(amtLabel, "West");
        add(amount, "East");
        
        // Currency
        chooser = new JComboBox(currencyName);
        chooser.addActionListener(new ComboListener());
        add(chooser, "East");
        
    } 
    // ****************************************************** 
    // Represents an action listener for the combo box. 
    // ****************************************************** 
    private class ComboListener implements ActionListener{ 
        // -------------------------------------------------- 
        // Determines which currency has been selected and 
        // the value in that currency then computes and 
        // displays the value in U.S. Dollars. 
        // -------------------------------------------------- 
        @Override
        public void actionPerformed (ActionEvent event){ 
            int index = chooser.getSelectedIndex(); 
            result.setText (amount.getText() + " " + currencyName[index] + 
            " = " + (rate[index] * Integer.valueOf(amount.getText())) + " U.S. Dollars"); 
        } 
    } 
}