import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        double Area = 3.14 * radius * radius;
        System.out.println(Area);
    }
}