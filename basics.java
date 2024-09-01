import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        // for (int i = 1; i < 11; i++) {
        // System.out.println("The table of the number is ");
        // System.out.println(n * i);
        // }
        // for (int i = 0; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println(" ");
         * }
         */
        /*
         * for (int i = n; i >= 1; i--) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + " ");
         * }
         * System.out.println();
         * }
         */
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= (n - i + 1); j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */
        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(number + " ");
         * number++;
         * }
         * System.out.println();
         * }
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}