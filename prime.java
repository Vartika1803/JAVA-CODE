import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;

            }

        }

        if (flag == true) {

            System.out.println("the number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}