public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {32, 99, 54, 9, 67, 38, 93};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("The MAX Element is : "+max);
        System.out.println("The SMAX Element is : "+smax);
    }
}
