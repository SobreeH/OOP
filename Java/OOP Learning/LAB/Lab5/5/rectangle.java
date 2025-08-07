import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner User_Input = new Scanner(System.in);
        
        System.out.println("Please enter the width of the rectangle (cm.): ");
        double width =  User_Input.nextDouble();
        
        System.out.println("Please enter the height of the rectangle (cm.): ");
        double height = User_Input.nextDouble();

        double Rect_Area = width * height;

        System.out.println("The area of the rectangle is "+ Rect_Area + " sq.com");
    }
}
