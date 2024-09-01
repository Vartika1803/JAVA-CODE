import java.util.*;

public class rotationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        System.out.println("Enter the no of element to shift with");
        int elementtoshift = sc.nextInt();
        int arrnew[] = new int[n];
        int arr[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = elementtoshift; i < n; i++) {
            arrnew[k] = arr[i];
            k++;
        }
        for (int i = 0; i < elementtoshift; i++) {
            arrnew[k] = arr[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrnew[i] + " ");
        }

    }
}