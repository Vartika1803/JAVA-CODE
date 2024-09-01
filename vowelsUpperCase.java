import java.util.*;

public class vowelsUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        char ch[] = str.toCharArray();
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                char word = Character.toUpperCase(ch[i]);
                ch[i] = word;
            }

            else if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                char word = Character.toUpperCase(ch[i]);
                continue;
            } else {
                char word = Character.toLowerCase(ch[i]);
                ch[i] = word;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(ch[i]);
        }

    }
}