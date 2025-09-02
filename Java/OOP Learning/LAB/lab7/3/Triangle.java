import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int userChoice;
do {
    System.out.print("\nEnter the number of rows for the triangle pattern: ");
    int size = scanner.nextInt();
    System.out.println("--- Here is your pattern ---");
    for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
        System.out.print("\nEnter 1 to create another pattern, or 0 to exit: ");
        userChoice = scanner.nextInt();
    } 
    while (userChoice == 1); // The loop continues as long as the user enters 1.
System.out.println("\nDone. Goodbye!");
scanner.close();
}
}