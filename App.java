import java.util.*;

public class App {

    public static int minChargingStations(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int n = arrivals.length;
        int i = 0, j = 0;
        int currentStations = 0;
        int maxStations = 0;

        while (i < n && j < n) {
            if (arrivals[i] < departures[j]) {
                currentStations++;
                maxStations = Math.max(maxStations, currentStations);
                i++;
            } else {
                currentStations--;
                j++;
            }
        }

        return maxStations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(minChargingStations(arr, arr1)); // Output should be 3
    }
}
