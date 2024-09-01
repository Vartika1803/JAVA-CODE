import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter operator +,-,*,/,%");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case 1:
                System.out.print(a + b);
                break;
            case 2:
                System.out.print(a - b);
                break;
            case 3:
                System.out.print(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.print("Invalid Division");
                } else {
                    System.out.print(a / b);
                    break;
                }

            case 5:
                if (b == 0) {
                    System.out.print("Invalid Division");
                } else {
                    System.out.print(a % b);
                }
                break;
            default:
                System.out.print("Inavalid operator");

        }

    }
}