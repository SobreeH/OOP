public class Operators{
    public static void main(String[] args) {
        int i, j, k, l = 0;
        k = l++;    // k = l        k = 0
                    // l = l + 1    l = 1

        j = ++k;    // k = 1 + k    k = 1
                    // j = k        j = 1
        
        i = j++;    // i = j        i = 1
                    // j = j + 1    j = 2


        System.out.println(i);
    }
}