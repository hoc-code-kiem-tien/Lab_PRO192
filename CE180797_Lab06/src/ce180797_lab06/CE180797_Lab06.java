package ce180797_lab06;

import java.util.Scanner;
import util.IOCE180797;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class CE180797_Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize scanner
        ShapeManagement shapes = new ShapeManagement();
        Scanner input = new Scanner(System.in);
        
        do {
            // Shows menu and receives the option
            System.out.println("---- SHAPE MANAGEMENT ----");
            System.out.println("1. Adds new Circle.");
            System.out.println("2. Adds new Triangle.");
            System.out.println("3. Adds new Rectangle.");
            System.out.println("4. Adds new Square.");
            System.out.println("5. Shows all Shapes.");
            System.out.println("6. The biggest area shape.");
            System.out.println("7. Sort ascending by shape area.");
            System.out.println("8. Search a shape.");
            System.out.println("9. Quit.");
            int option = IOCE180797.getInteger("Please select a function:", "The function of application must be from 1 to 9!", 1, 9);
            
            // Xét các trường hợp để gọi method
            switch (option) {
                case 1:
                    shapes.addCircle(); 
                    break;
                case 2:
                    shapes.addTriangle(); 
                    break;
                case 3:
                    shapes.addRectangle(); 
                    break;
                case 4:
                    shapes.addSquare(); 
                    break;
                case 5:
                    shapes.printData(); 
                    break;
                case 6:
                    shapes.biggestArea(); 
                    break;
                case 7:
                    shapes.sortAscending(); 
                    break;
                case 8:
                    shapes.searchShape(); 
                    break;
                case 9: 
                    // case thoát chương trình, in ra thông báo rồi return
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.print("SEE YOU AGAIN!");
                    return;
            }
        }
        while(true);
    }
    
}
