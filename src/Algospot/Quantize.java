package Algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quantize {
    static int[] num;
    static int[][] cache;
    static int[] pSum;
    static int[] pSqSum;

    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int testCases = Integer.parseInt(st.nextToken());

        for (int t = 0; t < testCases; t++) {
            st = new StringTokenizer(in.readLine());
            int numberLength = Integer.parseInt(st.nextToken());
            int quantums = Integer.parseInt(st.nextToken());

            int[] numbers = new int[numberLength];
            st = new StringTokenizer(in.readLine());

            for (int i = 0; i < numberLength; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            System.out.println(solve(numbers, quantums));
        }
    }

    private static int solve(int[] numbers, int quantums) {
        Arrays.sort(numbers);
        num = numbers;
        cache = new int[numbers.length+1][quantums+1];
        for (int[] ca: cache) {
            Arrays.fill(ca, -1);
        }

        pSum = new int[numbers.length+1];
        pSqSum = new int[numbers.length+1];

        pSum[0] = num[0];
        pSqSum[0] = num[0] * num[0];
        for (int i = 1; i < num.length; i++) {
            pSum[i] = pSum[i-1] + num[i];
            pSqSum[i] = pSqSum[i-1] + num[i] * num[i];
        }

        return solve(0, quantums);
    }

    private static int solve(int start, int remains) {
        if (start == num.length) return 0;
        if (remains == 0) return 987654321;
        if (cache[start][remains] != -1) return cache[start][remains];

        int min = 987654321;
        for (int i = start+1; i <= num.length; i++) {
            min = Math.min(min, solve(i, remains-1)+getMin(start, i-1));
        }

        return cache[start][remains] = min;
    }

    private static int getMin(int lo, int hi) {
        int sum = pSum[hi] - (lo == 0 ? 0 : pSum[lo-1]);
        int sqSum = pSqSum[hi] - (lo == 0 ? 0 : pSqSum[lo-1]);

        int m = (int)(0.5 + (double)sum / (hi-lo+1));

        return sqSum - 2 * m * sum + m * m * (hi-lo+1);
    }
}
