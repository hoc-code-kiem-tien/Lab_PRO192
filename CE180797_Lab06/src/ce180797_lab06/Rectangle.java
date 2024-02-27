package ce180797_lab06;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Rectangle extends Quadriateral {
    // Không có thuộc tính riêng
    
    // Constructor method
    public Rectangle(String ID, double width, double height, String color, boolean isFilled) {
        super(ID, width, height, color, isFilled);
    }
    
    // Method trả về diện tích
    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
    
    // Method trả về chu vi
    @Override
    public double getPerimeter() {
        return (getWidth()+getHeight())*2;
    }

    @Override
    public void showProfile() {
        System.out.printf("|%-12s|","Rectangle");
        super.showProfile();
        System.out.printf("%5.1f|%5.1f|%5s|%5.1f|%5.1f|\n", getWidth(), getHeight(),"-" ,getArea(), getPerimeter());
    }

}
