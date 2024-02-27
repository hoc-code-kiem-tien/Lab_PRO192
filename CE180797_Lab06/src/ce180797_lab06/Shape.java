package ce180797_lab06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nguyen Hoang Dat
 */
public abstract class Shape {
    // Attributes
    private String ID;
    private String color;
    boolean filled;
    private Date dateCreated;
    
    // Constructor methods
    public Shape() {
    }
    public Shape(String ID, String color, boolean isFilled) {
        this.ID = ID;
        this.color = color;
        this.filled = isFilled;
        this.dateCreated = new Date();
    }
    
    // Getters and setters
    public String getID() {
        return ID;
    }
    public void setId(String ID) {
        this.ID = ID;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
   }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    // Method trả về tháng/ngày/năm (format lại)
    @Override
    public String toString() {
        SimpleDateFormat currentDate = new SimpleDateFormat("MM/dd/yy");
        String currentdate = currentDate.format(dateCreated);
        return currentdate;
    } // toString() lấy chung từ class Shape nên những class extend không cần format trong prinf() khi in

    // Abstract methods, để class con xử lý
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void showProfile();

}
