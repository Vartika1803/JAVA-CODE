import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
