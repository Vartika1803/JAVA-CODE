import java.util.*;

public class swappingOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n1 and n2");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("the original number n1 and n2 is" + " " + n1 + " " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("The swapped numbers are" + " " + n1 + " " + n2);
    }
}