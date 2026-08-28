import java.util.Scanner;

public class SumOfOdd{

    static int sumOdd(int num){
        int sum = 0;
        while (num != 0){
           int digit = num % 10;
          if(digit%2 != 0){
            sum = sum + digit;
          } 
          num = num / 10;
        } 
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println(sumOdd(num));
    }
}