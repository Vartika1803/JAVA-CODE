import java.util.*;

public class minimumOf3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println("the minimum number is " + " " + n1);
            } else {
                System.out.println("The minimum number is " + " " + n3);
            }
        } else {
            System.out.println("The minimum number is " + " " + n2);
        }
    }
}