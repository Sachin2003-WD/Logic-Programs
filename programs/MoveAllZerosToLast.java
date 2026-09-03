import java.util.Arrays;

public class MoveAllZerosToLast {
    public static void main(String[] args) {
        int[] a = { 0, 2, 4, 5, 0, 3, 0, 2, 0, 4 };

        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j++] = a[j];
            }
        }
        while (j < a.length) {
            a[j++] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
