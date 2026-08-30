public class LargestElement{
    public static void main(String[] args){
        int[] arr = {34, 65, 23, 76, 34, 77};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The Max Array Number is : "+max);
    }
}