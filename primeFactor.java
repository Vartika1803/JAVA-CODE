import java.util.*;

public class primeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                // System.out.println(i + " " + "is factor");
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