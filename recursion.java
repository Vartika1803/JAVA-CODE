import java.util.*;

public class recursion {
    /*
     * public static void printNumb(int n) {
     * if (n == 6) {
     * return;
     * }
     * System.out.print(n);
     * printNumb(n + 1);
     * }
     * 
     * public static void main(String[] args) {
     * int n = 1;
     * printNumb(n);
     * }
     */
    /*
     * public static void printSum(int i, int n, int sum) {
     * if (i == n) {
     * sum += i;
     * System.out.println(sum);
     * return;
     * }
     * sum += i;
     * printSum(i + 1, n, sum);
     * }
     * 
     * public static void main(String[] args) {
     * printSum(1, 5, 0);
     * }
     */
    /*
     * public static void printFact(int n, int fact) {
     * if (n == 0) {
     * System.out.println(fact);
     * return;
     * }
     * fact *= n;
     * printFact(n - 1, fact);
     * }
     * 
     * public static void main(String[] args) {
     * printFact(3, 1);
     * }
     */
    /*
     * public static void printFibonacci(int n1, int n2, int n) {
     * if (n == 0) {
     * return;
     * }
     * System.out.println(n1);
     * printFibonacci(n2, n1 + n2, n - 1);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * printFibonacci(0, 1, 5);
     * }
     */
    /*
     * public static void towerofHanoi(int n, String src, String helper, String
     * dest) {
     * if (n == 1) {
     * System.out.println("transfer disk" + " " + n + " " + "from" + " " + src + " "
     * + "to" + dest);
     * return;
     * }
     * towerofHanoi(n - 1, src, dest, helper);
     * System.out.println("transfer disk" + " " + n + " " + "from" + " " + src + " "
     * + "to" + dest);
     * towerofHanoi(n - 1, helper, src, dest);
     * }
     * 
     * public static void main(String[] args) {
     * int n = 3;
     * towerofHanoi(n, "S", "H", "D");
     * }
     */
    /*
     * public static void printRev(String str, int idx) {
     * if (idx == 0) {
     * System.out.println(str.charAt(idx));
     * return;
     * }
     * System.out.print(str.charAt(idx));
     * printRev(str, idx - 1);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * String str = "VARTIKA";
     * printRev(str, str.length() - 1);
     * }
     */
    /*
     * public static int first = -1;
     * public static int last = -1;
     * 
     * public static void findOccurance(String str, int idx, char element) {
     * if (idx == str.length()) {
     * System.out.println(first);
     * System.out.print(last);
     * return;
     * }
     * char currChar = str.charAt(idx);
     * if (currChar == element) {
     * if (first == -1) {
     * first = idx;
     * } else {
     * last = idx;
     * }
     * }
     * findOccurance(str, idx + 1, element);
     * 
     * }
     * 
     * public static void main(String[] args) {
     * String str = "abaacdaefaah";
     * findOccurance(str, 0, 'a');
     * }
     */
    /*
     * public static boolean isSorted(int arr[], int idx) {
     * if (idx == arr.length - 1) {
     * return true;
     * }
     * if (arr[idx] < arr[idx + 1]) {
     * return isSorted(arr, idx + 1);
     * } else {
     * return false;
     * }
     * 
     * }
     * 
     * public static void main(String[] args) {
     * int arr[] = { 1, 3, 5 };
     * System.out.println(isSorted(arr, 0));
     * }
     */
    /*
     * public static void moveAllx(String str, int idx, String newstring, int count)
     * {
     * if (idx == str.length()) {
     * for (int i = 0; i < count; i++) {
     * newstring += "x";
     * }
     * System.out.println(newstring);
     * return;
     * }
     * char currChar = str.charAt(idx);
     * if (currChar == 'x') {
     * count++;
     * moveAllx(str, idx + 1, newstring, count);
     * } else {
     * newstring += currChar;
     * moveAllx(str, idx + 1, newstring, count);
     * }
     * }
     * 
     * public static void main(String[] args) {
     * String str = "axbcxxd";
     * moveAllx(str, 0, " ", 0);
     * }
     */
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newstring);
        } else {
            newstring += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newstring);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, " ");
    }

}