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
    
    // constructor methods
    public Circle() {
        super(null, null);
    }
    public Circle(String id, String color, double radius) {
        super(id, color);
        this.radius = radius;
    }
    
    // Ghi đè method của base-class
    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; 
    }
    @Override
    public String entryData() {
         String str = String.format("Add Circle: %s - %s - %.1f", getId(), getColor(), radius);
        return str;
    }
    @Override
    public String printData() {
        String str = String.format("Circle: %s - %s - %.1f - %.1f - %.1f",getId(), getColor(), radius, getArea(), getPerimeter());
      return str;
    }    
    
}
