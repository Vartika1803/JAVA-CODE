import java.util.*;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int n1 = n;
        int number = 0;
        while (n > 0) {
            int remainder = n % 10;
            number += Math.pow(remainder, 3);
            n = n / 10;
        }
        if (number == n1) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }

    }
}
