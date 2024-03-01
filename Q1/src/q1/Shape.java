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
public abstract class Shape {
    // attributes
    protected String id;
    String color;

    // constructor method
    public Shape() {
    }
    public Shape(String id, String color) {
        this.id = id;
        this.color = color;
    }

    // Getters va setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    // abstract methods, cho class extend xử lý
    public abstract double getArea();
    public abstract double getPerimeter();    
    public abstract String entryData();    
    public abstract String printData();    
    
}
