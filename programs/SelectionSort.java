public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 32, 99, 54, 9, 67, 38, 93 };
        int count=0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            count++;
            // Swap smallest found element with current position
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
         System.out.println(count);
        // Print array
        for (int num : arr)
            System.out.print(num + " ");

       
    }
}