public class repeating_pattern {
    public static void main(String[] args) {
        int i =1, k =1;
       while (i<=5) {
        for (int j=9; j >=0; j--){
            while (k <=5) {
                System.out.print(j);
                k++;
            }
        k=1;
        }
        System.out.println();
        i++;
    }
    }    
}
