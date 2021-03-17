/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintingshape;

/**
 *
 * @author hp
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle (double length, double width){
    super("Rectangle");
    this.length = length;
    this.width = width;
}
    
    @Override
    public double area(){
        return length * width;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of width " + width + " and length " + length;
    }
}
