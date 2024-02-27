package ce180797_lab06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import util.IOCE180797;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class ShapeManagement {
    // Tạo ArrayList quản lý hình thuộc class Shape
    private ArrayList<Shape> listShapes;
    
    // Constructors
    public ShapeManagement() {
        listShapes = new ArrayList<>();
    }
    
    // Method thêm hình tròn
    public void addCircle() {
        String ID, color;
        boolean filled;
        double radius;
        int position;
        System.out.println("----- Add new Circle -----");
        do { 
            // Dùng getString trong class OICE180797 để nhận input và bắt lỗi
            ID = IOCE180797.getString("Input ID: ", "ID must be exactly 2 characters.", 2); 
            position = searchShapeByID(ID); // gọi method tìm sách bằng ID gán cho vị trí position
            //Kiểm tra ID có trùng ID đã tồn tại không?
            if (position != -1) {
                System.out.println("This " + ID + " is already exists!");
            }
        } while (position != -1);
        // Dùng getString trong class OICE180797 để nhận input và bắt lỗi
        color = IOCE180797.getString("Input color: "); 
        // Dùng getDouble trong class OICE180797 để nhận input và bắt lỗi
        radius = IOCE180797.getDouble("Input radius: ", "Radius must be greater than 0.", 0); 
        filled = IOCE180797.isFilled(); 
        listShapes.add(new Circle(ID, radius, color, filled)); 
        System.out.println("Circle created and added to list of shapes successful!");
    }
    
    // Method thêm hình tam giác
    public void addTriangle() {
        String ID, color;
        boolean filled;
        double side1, side2, side3;
        int position;
        System.out.println("----- Add new Triangle -----");
        do {            
            ID = IOCE180797.getString("Input ID: ", "ID must be exactly 2 characters.", 2); 
            position = searchShapeByID(ID);
            if (position != -1) {
                System.out.println("This " + ID + " is already exists!");
            }
        } while (position != -1);
        color = IOCE180797.getString("Input color: "); //Tham chiếu biến String color đến phương thức getString() có trong file IOCE181022 để kiểm tra tính hợp lệ của color.
        side1 = IOCE180797.getDouble("Input the first side: ", "Side must be greater than 0.", 0); 
        side2 = IOCE180797.getDouble("Input the second side: ", "Side must be greater than 0.", 0); 
        side3 = IOCE180797.getDouble("Input the third side: ", "Side must be greater than 0.", 0); 
        filled = IOCE180797.isFilled(); 
        listShapes.add(new Triangle(ID, side1, side2, side3, color, filled)); 
        System.out.println("Triangle created and added to list of shapes successful!");
    }
    
    // Method thêm hình Chữ nhật
    public void addRectangle() {
        String ID, color;
        boolean filled;
        double width, height;
        int pos;
        System.out.println("----- Add new Rectangle -----");
        do {            
            ID = IOCE180797.getString("Input ID: ", "ID must be exactly 2 characters.", 2); 
            pos = searchShapeByID(ID);
            if (pos != -1) {
                System.out.println("This " + ID + " is already exists!");
            }
        } while (pos != -1);
        color = IOCE180797.getString("Input color: ");
        width = IOCE180797.getDouble("Input width: ", "Width must be greater than 0.", 0); 
        height = IOCE180797.getDouble("Input height: ", "Height must be greater than 0.", 0);
        filled = IOCE180797.isFilled(); 
        listShapes.add(new Rectangle(ID, width, height, color, filled)); 
        System.out.println("Rectangle created and added to list of shapes successful!");
    }
    
    // Method thêm hình vuông
    public void addSquare() {
        String ID, color;
        boolean filled;
        double edge;
        int pos;
        System.out.println("----- Add new Square -----");
        do {            
            ID = IOCE180797.getString("Input ID: ", "ID must be exactly 2 characters.", 2); 
            pos = searchShapeByID(ID);
            if (pos != -1) {
                System.out.println("This " + ID + " is already exists!");
            }
        } while (pos != -1);
        color = IOCE180797.getString("Input color: "); 
        edge = IOCE180797.getDouble("Input edge: ", "Edge must be greater than 0.", 0); 
        filled = IOCE180797.isFilled(); 
        listShapes.add(new Square(ID, edge, color, filled)); 
        System.out.println("Square created and added to list of shapes successful!");
    }
    
    // Method tìm sách bằng ID. Trả về vị trí nếu tìm được, trả về -1 nếu không.
    public int searchShapeByID(String ID) { 
        if(listShapes.isEmpty()) 
            return -1;
        for(int i = 0; i<listShapes.size(); i++) {
            if(listShapes.get(i).getID().equalsIgnoreCase(ID)){
                return i;
            }
        }
        return -1; 
    }
    
    // Method in tất cả thuộc tính của tất cả đối tượng trong listShapes
    public void printData() {
        System.out.println("----- List of Shapes -----");
        // Nếu listShapes không có phần tử nào thì báo rỗng
        if(listShapes.isEmpty()) {
            System.out.println("Empty.");
        // Nếu có thì in ra
        }else {
            for(int i=0; i < listShapes.size(); i++) { 
                listShapes.get(i).showProfile();
            }
        }
    }
    
    // Method tìm hình có diện tích lớn nhất
    public void biggestArea() {
        // Tìm diện tích max
        double maxArea = listShapes.get(0).getArea(); 
                for(int i = 0; i < listShapes.size(); i++) {
            if (listShapes.get(i).getArea() > maxArea) { 
                maxArea = listShapes.get(i).getArea();
            }
        }
        // In ra hình có diện tích max
        System.out.println("----- List of the biggest Area Shapes -----");
        for(int i = 0; i < listShapes.size(); i++) {
            if (listShapes.get(i).getArea() == maxArea) { 
                listShapes.get(i).showProfile();
            }
        }
    }
    
    // Method sắp xếp tăng dần theo diện tích 
    public void sortAscending() { 
        Comparator<Shape> cm = new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if (o1.getArea() < o2.getArea()) { 
                    return -10;
                } else if (o1.getArea() > o2.getArea()) {
                    return 10;
                } else {
                    return 0;
                }
            }
        };
        System.out.println("----- List of Shapes -----");
        listShapes.sort(cm); //xài method sort()
        for(int i = 0; i<listShapes.size(); i++) { 
            listShapes.get(i).showProfile();
        }
    }
    
    // Method in ra hình cần tìm, không tìm được in "Not found!"
    public void searchShape() {
        System.out.println("Find Shape:");
        System.out.print("Input ID to find: ");
        Scanner sc = new Scanner(System.in);
        String findID = sc.nextLine();
        int pos = searchShapeByID(findID); 
        if(pos == -1) { 
            System.out.println("Not found!");
        } else { 
            for(int i = 0; i<listShapes.size(); i++) { 
                // ID trùng thì in ra
                if(listShapes.get(i).getID().equals(findID)){
                }
            }
        }
    }
    
}
