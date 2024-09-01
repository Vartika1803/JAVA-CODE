import java.util.*;

public class binarySearch {
    public static int binarysearchfunction(int arr[], int num, int start, int end) {
        while (start <= end) {
            int len = arr.length;

            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                end = mid - 1;
                return binarysearchfunction(arr, num, start, mid - 1);
            } else {
                return binarysearchfunction(arr, num, mid + 1, end);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num = sc.nextInt();
        int start = 0;
        int end = len - 1;
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = binarysearchfunction(arr, num, start, end);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is " + result);
        }

    }
}