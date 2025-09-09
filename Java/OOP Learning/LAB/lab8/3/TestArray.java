public class TestArray {
    public static void main(String[] args) {
        int i,j,x=0;

        int[][] m = new int[2][3];

        for (i = 0; i < 2; i++) {
            for (j = 0;j < 2;j++ ){
                m[i][j] = x++;
                System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
            }
        }
    }    
}
