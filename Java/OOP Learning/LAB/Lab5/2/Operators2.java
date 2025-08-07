
public class Operators2 {

    public static void main(String[] args) {
        // && operator

            System.out.println((5 > 3) && (8 > 5)); // T and T = T
            System.out.println((5 > 3) && (8 < 5)); // T and F = F 
        
        // || operator

            System.out.println( (5 < 3) || (8 > 5) ); // F or T = T
            System.out.println( (5 > 3) || (8 < 5) ); // T or F = T
            System.out.println( (5 < 3) || (8 < 5) ); // F or F = F 
        
        // ! operator

            System.out.println(!( 5 == 3)); // not F = T
            System.out.println(!(5 > 3)); //   not T = F

    }
}
