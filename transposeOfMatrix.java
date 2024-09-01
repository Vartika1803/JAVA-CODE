import java.util.*;

public class transposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of array");
        int r = sc.nextInt();
        System.out.println("Enter the column of array");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int khaliarr[][] = new int[c][r];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                khaliarr[i][j] = arr[j][i];
                System.out.print(khaliarr[i][j]);
            }
            System.out.println();
        }

    }
}
