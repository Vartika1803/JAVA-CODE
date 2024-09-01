import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int n1 = n;
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        if (n1 == reverse)
            System.out.println("the given number is palindrome");
        else
            System.out.println("the given number is not Palindrome");

    }

}
