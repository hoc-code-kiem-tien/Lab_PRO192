package ce180797_lab06;

/**
 *
 * @author Nguyen Hoang Dat
 */
public abstract class Quadriateral extends Shape{
    private double width;
    private double height;

    public Quadriateral(String id, double width, double height, String color, boolean isFilled) {
        super(id, color, isFilled);
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
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
    
    // Method in ra thông tin của hình
    @Override
    public void showProfile() {
        System.out.printf("%4s|%s|%10s| %s|", getID(), toString(), getColor(), isFilled());
    }
    
    
}
