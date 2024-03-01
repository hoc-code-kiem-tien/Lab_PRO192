/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Circle extends Shape{
    // attributes
    private double radius;

    // constructor method
    public Circle() {
    }
    public Circle(String id, String color, double radius) {
        super(id, color);
        this.radius = radius;
    }
    
    //getters setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Ghi đè các phương thức của Shape
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public String entryData() {
        return String.format("Add Circle: %s - %s - %.1f", 
                id, color, radius);
    }
    @Override
    public String printData() {
        return String.format("Circle: %s - %s - %.1f - %.1f - %.1f",
                id, color, radius, getArea(), getPerimeter());
    }
    
    
    
    
}
