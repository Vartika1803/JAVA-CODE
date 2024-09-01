import java.util.*;

public class linearSearch {
    public static int linearsearchfunction(int arr[], int num) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int num = sc.nextInt();
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int result = linearsearchfunction(arr, num);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is " + result);
        }
    }
}