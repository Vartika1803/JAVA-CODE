import java.util.*;

public class findMinSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int num1 = 0;
    int num2 = 0;
    for (int i = 0; i < n; i++) {

      if (i % 2 == 0) {
        num1 = num1 * 10 + arr[i];
      } else {
        num2 = num2 * 10 + arr[i];
      }

    }
    int sum = num1 + num2;
    System.out.println("The sum is" + sum);

  }
}
