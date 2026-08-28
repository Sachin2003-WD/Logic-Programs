import java.util.Scanner;

public class Summation {

    static int sum(int num){
        
        int add = 0;
        while(num != 0){
            int dig = num%10;
            add = add+dig;
            num = num/10;
        }
        return add;
    }
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
