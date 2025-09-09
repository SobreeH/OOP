public class Exercise {
    public static void min(int a[]) {
        int min = a[0];
        for (int i =0; i < 10; ++i) {
            if (min > a[i])
            min = a[i];
        }
        System.out.println("Min : " + min);
    }

    public static void max(int b[]) {
        int max = b[0];
        for (int i = 0; i < 10; ++i) {
            if (max < b[i])
            max = b[i];
        }
        System.out.println("Max : " + max);
    }
    public static void main(String[] args) {
        int [] num = {3,5,1,8,4,6,2,9,7,0};
        min(num);
        max(num);
    }
}
