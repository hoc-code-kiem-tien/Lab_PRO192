package ce180797_lab06;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class Square extends Rectangle {
    // Không có thuộc tính thêm
    
    // Constructor method
    public Square(String id, double edge, String color, boolean filled) {
        super(id, edge, edge, color, filled);
    }

    // Method in ra các thông tin
    @Override
    public void showProfile() {   
        System.out.printf("|%-10s|%4s|%s|%10s| %s|","Square", getID(), toString(), getColor(), isFilled());
        System.out.printf("%5.1f|%5s|%5s|%5.1f|%5.1f|\n", getWidth(), "-", "-", getArea(), getPerimeter());

    }

}
