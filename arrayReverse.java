import java.util.*;

public class arrayReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
            System.out.print(rev[i]);
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // String str = sc.nextLine();
        // char arr[] = str.toCharArray();

        // int len = str.length();
        // int start = 0, end = len - 1;
        // while (start < end) {

        // if (Character.isLetterOrDigit(arr[start]) &&
        // Character.isLetterOrDigit(arr[end])) {
        // char temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;
        // start++;
        // end--;
        // } else if (!Character.isLetterOrDigit(arr[start]) &&
        // !Character.isLetterOrDigit(arr[end])) {
        // start++;
        // end--;
        // } else if (!Character.isLetterOrDigit(arr[start]) &&
        // Character.isLetterOrDigit(arr[end]))
        // start++;
        // else if (Character.isLetterOrDigit(arr[start]) &&
        // !Character.isLetterOrDigit(arr[end]))
        // end--;

        // }

        // System.out.println(arr);

    }
}