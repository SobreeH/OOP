import java.util.Scanner;
public class decistring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String userString  = scanner.nextLine();
        if(userString.length() > 10){
            userString = userString.substring(0, 10);
            System.out.println("Input string exceeds 10, Cutting to only 10 characters...");
        }
        System.out.println("you entered:"+ userString);
        
        for (int i = 0; i < 10 ; i+=2 ){
            System.out.print(userString.charAt(i) + " ");
        }
        scanner.close();
    }    
}
