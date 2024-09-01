import java.util.*;

public class swappingOfnumberWithoutTemp {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original number n1 and n2");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("The swapped number are" + " " + n1 + " " + n2);
        sc.close();
    }

}