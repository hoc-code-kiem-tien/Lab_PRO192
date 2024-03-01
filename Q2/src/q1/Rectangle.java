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
public class Rectangle extends Shape{
    // attributes
    private double width;
    private double height;
    
    // constructor methods
    public Rectangle() {
        super(null, null);
    }
    public Rectangle(String id, String color, double width, double height) {
        super(id, color);
        this.width = width;
        this.height = height;
    }

    // getters setters
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    // Ghi đè phương thức của base-class
    
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
        String str = String.format("Add Rectangle: %s - %s - %.1f - %.1f", getId(), getColor(), width, height);
        return str;
    }
    @Override
    public String printData() {
      String str = String.format("Rectangle: %s - %s - %.1f - %.1f - %.1f - %.1f",getId(), getColor(), width, height, getArea(), getPerimeter());
      return str;
    }
}
