package util;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Dat
 */
public class IOCE180797 {
    private static Scanner input = new Scanner(System.in);
    
    // Method bắt lỗi string không được trống
    public static String getString(String iMsg) {
        String str;
        while(true) {
            System.out.print(iMsg);
            str = input.nextLine();
            if(str.isEmpty()) {
                System.out.println("Not empty!");
                continue;
            }
            return str;
        }
    }
    
    // Method bắt lỗi string phải có chiều dài numLength
    public static String getString(String iMsg, String eMsg, int numLength) {
        String str;
        while (true) {
            System.out.print(iMsg);
            str = input.nextLine();
            if (str.isEmpty()) {
                System.out.println("Not empty.");
                continue;
            }
            try {
                if(str.length() != numLength)
                    throw new Exception();
                return str;
            } catch(Exception e) {
                System.out.println(eMsg);
            }
        }
    }
    
    // Hàm kiểm tra số Integer (Dùng cho option nhập vào)
    public static int getInteger(String iMsg, String eMsg, int from, int to){
        while(true){
            System.out.print(iMsg);
            String num = input.nextLine();
            if(num.isEmpty()){
                System.out.println("Not Empty!");
                continue;
            }
            try {
                int n = Integer.parseInt(num);
                if(n < from || n > to){
                    throw new IllegalArgumentException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("It's must be an integer!");
            } catch (IllegalArgumentException e){
                System.out.println(eMsg);
            }
        }
    }
    
    // Method kiểm tra số thực. Phải không empty và lớn hơn num
    public static double getDouble(String iMsg, String eMsg, int num) {
        while(true) {
            System.out.print(iMsg);
            String number = input.nextLine();
            if(number.isEmpty()) {
                System.out.println("Not empty!");
                continue;
            }
            try {
                double n = Double.parseDouble(number);
                if(n<=num)
                    throw new IllegalArgumentException();
                return n;
            } catch(NumberFormatException e) {
                System.out.println("It's must be a number!");
            } catch(IllegalArgumentException e) {
                System.out.println(eMsg);
            }
        }
    }
    
    public static boolean isFilled() {
        return true;
    }
}
