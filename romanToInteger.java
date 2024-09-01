import java.util.*;

public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int len = str.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'I') {
                if (i < len - 1 && str.charAt(i + 1) == 'V') {
                    num = num + 4;
                    i++;
                } else if (i < len - 1 && str.charAt(i + 1) == 'X') {
                    num = num + 9;
                    i++;
                } else {
                    num = num + 1;
                }
            } else if (str.charAt(i) == 'V') {
                num = num + 5;
            } else if (str.charAt(i) == 'X') {
                if (i < len - 1 && str.charAt(i + 1) == 'L') {
                    num = num + 40;
                    i++;
                } else if (i < len - 1 && str.charAt(i + 1) == 'C') {
                    num = num + 90;
                    i++;
                } else {
                    num = num + 10;
                }

            } else if (str.charAt(i) == 'L') {
                num = num + 50;
            } else if (str.charAt(i) == 'C') {
                if (i < len - 1 && str.charAt(i + 1) == 'D') {
                    num = num + 400;
                    i++;
                } else if (i < len - 1 && str.charAt(i + 1) == 'M') {
                    num = num + 900;
                    i++;
                } else {
                    num = num + 100;
                }

            } else if (str.charAt(i) == 'D') {
                num = num + 500;
            } else if (str.charAt(i) == 'M') {
                num = num + 1000;
            }
        }
        System.out.println(num);
    }
}