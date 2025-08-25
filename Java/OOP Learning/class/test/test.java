import java.util.Scanner;
public class test{
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
     int x = input.nextInt();
//      if (x == 1) {
//          System.out.println("X is 1");   
//     }    
//     else if (x ==2 ) {
//         System.out.println("X is 2");
//     }
//     else {
//         System.out.println("X is not 1 or 2");
//     }
//     input.close();

        // switch (x) {
        //     case 1:
        //         System.out.println("X is 1");
        //         break;
        //     case 2:
        //         System.out.println("X is 2");
        //         break;
        //     default:
        //         System.out.println("X is not 1 or 2");
        //         break;
        // }
        // while (x <= 5) {
        //     System.out.println("X = " + x);
        //     System.out.println("X is less than 5");
        //     x++;
            
        // }

        // do {
        //     System.out.println("X = " + x);
        //     System.out.println("X is less than 5");
        //     x++;
        // } while (x <= 5);

        for (int i = x; i <= 5; i++) {
            System.out.println("X = " + i);
            System.out.println("X is less than 5");
        }

        input.close();
 }
}