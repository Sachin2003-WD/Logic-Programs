import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 3, 5 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
        // System.out.println(set);
    }
}
