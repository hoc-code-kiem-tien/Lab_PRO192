package ce180797_lab06;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Triangle extends Shape {
    // Attributes
    private double side_1;
    private double side_2;
    private double side_3;

    // Constructor method
    public Triangle(String ID, double side_1, double side_2, double side_3, String color, boolean isFilled) {
        super(ID, color, isFilled);
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    // Getters and setters
    public double getSide_1() {
        return side_1;
    }
    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }
    public double getSide_2() {
        return side_2;
    }
    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }
    public double getSide_3() {
        return side_3;
    }
    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }

    // Phương thức trả về diện tích
    @Override
    public double getArea() {
        double p = getPerimeter()/2; // Nửa chu vi
        return Math.sqrt(p*(p-side_1)*(p-side_2)*(p - side_3));
    }
    
    // Phương thức trả về chu vi
    @Override
    public double getPerimeter() {
        return side_1+side_2+side_3;
    }
    
    // Phương thức in ra các thông tin
    @Override
    public void showProfile() {
        System.out.printf("|%-10s|%4s|%s|%10s|%5s|%5.1f|%5.1f|%5.1f|%5.1f|%5.1f|\n",
                "Triangle:", getID(), toString(), getColor(), isFilled(), side_1, side_2, side_3, getArea(), getPerimeter());
    }

}
