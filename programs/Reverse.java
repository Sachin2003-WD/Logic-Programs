import java.util.Scanner;

public class Reverse{

    static int reverseNumber(int num){
        int rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = (rev*10) + digit;
            num = num/10;
        }
        return  rev;
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();

        System.out.println(reverseNumber(num));
    }
}