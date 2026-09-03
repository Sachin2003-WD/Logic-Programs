import java.util.Arrays;

public class DuplicateAdajcent {

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 4, 5, 5 };
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.print(a[i - 1] + " ");
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
