import java.util.*;

public class findNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be checked");
        int number = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == number) {
                System.out.println(i);
                flag = true;
            }
        }
        if (flag = false) {
            System.out.println("element not found");
        }

    }
}