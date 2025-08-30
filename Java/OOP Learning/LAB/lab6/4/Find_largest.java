import java.util.Scanner;

public class Find_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the 1st number: ");
        double num1 = sc.nextDouble();

        System.out.println("Please input the 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.println("Please input the 3rd number: ");
        double num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
        sc.close();
    }
}
