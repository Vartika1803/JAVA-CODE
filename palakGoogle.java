import java.util.Scanner;

public class palakGoogle {

    static class SegmentTree {
        int[] tree;
        int n;

        SegmentTree(int[] array) {
            n = array.length;
            tree = new int[4 * n];
            build(array, 0, 0, n - 1);
        }

        void build(int[] array, int node, int start, int end) {
            if (start == end) {
                tree[node] = array[start];
            } else {
                int mid = (start + end) / 2;
                int leftChild = 2 * node + 1;
                int rightChild = 2 * node + 2;

                build(array, leftChild, start, mid);
                build(array, rightChild, mid + 1, end);

                tree[node] = tree[leftChild] + tree[rightChild];
            }
        }

        void update(int idx, int val, int node, int start, int end) {
            if (start == end) {
                tree[node] = val;
            } else {
                int mid = (start + end) / 2;
                int leftChild = 2 * node + 1;
                int rightChild = 2 * node + 2;

                if (start <= idx && idx <= mid) {
                    update(idx, val, leftChild, start, mid);
                } else {
                    update(idx, val, rightChild, mid + 1, end);
                }

                tree[node] = tree[leftChild] + tree[rightChild];
            }
        }

        int query(int L, int R, int node, int start, int end) {
            if (R < start || end < L) {
                return 0;
            }

            if (L <= start && end <= R) {
                return tree[node];
            }

            int mid = (start + end) / 2;
            int leftChild = 2 * node + 1;
            int rightChild = 2 * node + 2;

            int sumLeft = query(L, R, leftChild, start, mid);
            int sumRight = query(L, R, rightChild, mid + 1, end);

            return sumLeft + sumRight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of elements in array A
            int Q = sc.nextInt(); // Number of queries

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            SegmentTree segmentTree = new SegmentTree(A);

            for (int i = 0; i < Q; i++) {
                int queryType = sc.nextInt();

                if (queryType == 1) {
                    int index = sc.nextInt() - 1; // 1-based index to 0-based index
                    int val = sc.nextInt();
                    segmentTree.update(index, val, 0, 0, N - 1);
                } else if (queryType == 2) {
                    int L = sc.nextInt() - 1; // 1-based index to 0-based index
                    int R = sc.nextInt() - 1; // 1-based index to 0-based index
                    System.out.println(calculateRangeFunction(segmentTree, L, R, N));
                }
            }
        }

        sc.close();
    }

    private static int calculateRangeFunction(SegmentTree segmentTree, int L, int R, int N) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            for (int j = i; j <= R; j++) {
                result += segmentTree.query(i, j, 0, 0, N - 1);
            }
        }
        return result;
    }
}
