import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter an integer : ");
        // int i= sc.nextInt();

        // System.out.println("Please enter a double : ");
        // double d = sc.nextDouble();

        // System.out.println("Your Integer is  "+ i);
        // System.out.println("Your Double is  "+ d);

        String my = sc.nextLine();

        System.out.println("Your string is  "+ my);
        sc.close();
    }
}
