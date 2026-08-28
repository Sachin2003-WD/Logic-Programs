import java.util.Scanner;

public class Prime {

    static String isPrime(int num) {

        if (num < 2) {
            return "The Entered Value is Not Prime.";
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "The Entered Value is Not Prime.";
            }
        }

        return "The Entered Value is Prime.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));

        sc.close();
    }
}