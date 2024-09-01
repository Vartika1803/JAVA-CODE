import java.util.*;

public class primeFactorPalak {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        // boolean flag=true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    System.out.println(i);
            }
        }
    }

}