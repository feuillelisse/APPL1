/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeofEmployee;

public class Commission extends Hourly {
    private double totalSales;
    private double commisionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commisionRate = comRate;
    }
    
    public void addSales(double tSale){
        totalSales = tSale;
    }
    
    @Override
    public double pay(){
        double payment = totalSales*commisionRate + super.pay();
        totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
}
