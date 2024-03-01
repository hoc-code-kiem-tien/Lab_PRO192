/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Locale;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Rectangle extends Shape{
    
    // attributes
    private double width;
    private double height;

    // constructor method
    public Rectangle() {
    }
    public Rectangle(String id, String color, double width, double height) {
        super(id, color);
        this.width = width;
        this.height = height;
    }
    
    // getters, setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Ghi đè xử lý phương thức của base-class    
    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
    @Override
    public String entryData() {
        return String.format("Add Rectangle: %s - %s - %.1f - %.1f", 
                id, color, width, height);
    }
    @Override
    public String printData() {
        return String.format("Rectangle: %s - %s - %.1f - %.1f - %.1f - %.1f", 
                id, getColor(), width, height, getArea(), getPerimeter());
    }
    
}
