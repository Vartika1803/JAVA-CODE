import java.util.*;

public class arraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elemnts");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }
}