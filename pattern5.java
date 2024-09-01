import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}