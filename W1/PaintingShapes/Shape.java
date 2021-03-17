/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

//************************************
// Shape.java
//************************************
public abstract class Shape{
    protected String shapeName;
    public Shape (String shapeName){
        this.shapeName = shapeName;
    }
    
    abstract double area();
    
    @Override
    public String toString(){
        return shapeName;
    }
}

