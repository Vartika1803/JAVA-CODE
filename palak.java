import java.util.*;

class TestClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int singer[] = new int[N];
        for (int i = 0; i < N; i++) {
            singer[i] = sc.nextInt();
        }

        Arrays.sort(singer);

        ArrayList<Integer> totalSingers = new ArrayList<Integer>();
        totalSingers.add(singer[0]);
        for (int i = 1; i < N; i++) {
            if (singer[i] != singer[i - 1])
                totalSingers.add(singer[i]);
        }
        int unique = totalSingers.size();
        ArrayList<Integer> freq = new ArrayList<Integer>();

        for (int i = 0; i < unique; i++) {
            int current = totalSingers.get(i);
            int f = 0;
            for (int j = 0; j < N; j++) {
                if (singer[j] == current) {
                    f++;
                }
            }
            freq.add(f);
        }

        int count = 0;
        int max = freq.get(0);
        for (int i = 1; i < unique; i++) {
            if (freq.get(i) > max)
                max = freq.get(i);
        }
        for (int i = 0; i < unique; i++) {
            if (freq.get(i) == max)
                count++;
        }
        System.out.println(count);
    }
}
