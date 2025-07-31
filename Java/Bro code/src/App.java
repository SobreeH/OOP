import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // int age = 21;

        // System.out.println(age);

        Scanner Accept_Input = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = Accept_Input.nextLine();

        System.out.println("Hello " + name);
        Accept_Input.close();
    }
}
