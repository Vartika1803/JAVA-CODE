import java.util.*;

public class arraySum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        int sum = 0;
        System.out.println("Enter the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)

            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)

            {
                sum = sum + arr[i][j];
            }

        }
        System.out.println(sum);

    }
}