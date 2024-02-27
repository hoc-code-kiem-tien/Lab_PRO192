package ce180797_lab06;

/**
 *
 * @author Nguyen Hoang Dat
 */

public class Circle extends Shape{
    // Attributes
    private double radius;
    
    // Constructor method
    public Circle(String id, double radius, String color, boolean isFilled){
        super(id, color, isFilled);
        this.radius = radius;
    }
    
    // Getters and Setters
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    // Method trả về chu vi
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    // Method trả về diện tích
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // Method in ra các thông tin
    @Override
    public void showProfile(){
        System.out.printf("|%-10s|%4s|%s|%10s|%5s|%5.1f|%5s|%5s|%5.1f|%5.1f|\n",
                "Circle:", getID(), toString(), getColor(), isFilled(), radius, "-", "-", getArea(), getPerimeter());
    }

}