package Algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JLIS {
    private static final long NEGINF = Long.MIN_VALUE;
    private static int[][] cacheAB;

    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int testCases = Integer.parseInt(st.nextToken());

        for (int t = 0; t < testCases; t++) {
            st = new StringTokenizer(in.readLine());
            int aSize = Integer.parseInt(st.nextToken());
            int bSize = Integer.parseInt(st.nextToken());

            int[] arrA = new int[aSize];
            st = new StringTokenizer(in.readLine());
            for (int a = 0; a < aSize; a++) {
                arrA[a] = Integer.parseInt(st.nextToken());
            }

            int[] arrB = new int[bSize];
            st = new StringTokenizer(in.readLine());
            for (int b = 0; b < bSize; b++) {
                arrB[b] = Integer.parseInt(st.nextToken());
            }

            System.out.println(solve(arrA, arrB));
        }
    }

    private static int solve(int[] arrA, int[] arrB) {
        if (arrA == null || arrB == null) return 0;

        cacheAB = new int[arrA.length+1][arrB.length+1];
        init(cacheAB);

        return solve(arrA, arrB, -1, -1);
    }

    private static void init(int[][] cache) {
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
    }

    private static int solve(final int[] A, final int[] B, final int ia, final int ib) {
        if (cacheAB[ia+1][ib+1] != -1) return cacheAB[ia+1][ib+1];

        long a = (ia == -1 ? NEGINF : A[ia]);
        long b = (ib == -1 ? NEGINF : B[ib]);
        long element = Math.max(a, b);

        int max = 0;
        for (int next = ia+1; next < A.length; next++) {
            if (element < A[next]) {
                max = Math.max(max, solve(A, B, next, ib)+1);
            }
        }

        for (int next = ib+1; next < B.length; next++) {
            if (element < B[next]) {
                max = Math.max(max, solve(A, B, ia, next)+1);
            }
        }

        return cacheAB[ia+1][ib+1] = max;
    }
}
