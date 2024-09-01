import java.util.*;

public class selectionSortingFunction {
    public static void functionselection(int n, int arr[]) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        functionselection(n, arr);

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + " ");

        }

    }
}
