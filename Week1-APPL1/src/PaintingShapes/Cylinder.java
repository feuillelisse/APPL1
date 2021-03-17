/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;


public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder (double radius, double height){
    super("Cylinder");
    this.radius = radius;
    this.height = height;
}
    @Override
    public double area(){
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
