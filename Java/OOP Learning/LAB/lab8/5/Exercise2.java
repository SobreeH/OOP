public class Exercise2 {
    public static void avg(int a[]) {
        float sum = 0;
        for (int i =0; i < a.length; ++i) {
            sum += a[i];
        }
        System.out.println("AVG : " + sum/a.length);
    }

    public static void main(String[] args) {
        int [] num = {3,5,1,8,4,6,2,9,7,0};
        avg(num);
    }
}
