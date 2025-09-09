public class Mystery {
    public static void main(String[] args) {
        int[] a = {7,2,8,4};
        mystery(a);
        for(int i = 0 ; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }   
    
    public static void mystery(int[] b){
        for (int i = 0 ; i < (b.length - 1); i++){
            if (b[i] < b[i+1]){
                b[i] = b[i+1];
            }
        }
    }
}
