import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        long storevalue = 1;

        for (int i = 1; i <= n; i++) {
            storevalue = storevalue * i;

        }
        System.out.println("the factorial of the number is " + storevalue);
    }
}