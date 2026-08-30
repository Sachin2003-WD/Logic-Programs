public class SmallestElement {
    public static void main(String[] args){
        int arr[] = {1,5,3,34,32,4,6};
        int small = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("The Smallest Element in the array : "+small);
    }
}
