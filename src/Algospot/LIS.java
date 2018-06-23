package Algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LIS {
    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        for (int t = 0; t < testCases; t++) {
            int len = Integer.parseInt(in.readLine().trim());
            StringTokenizer st = new StringTokenizer(in.readLine());

            int[] arr = new int[len];

            for (int i = 0; i < len; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            System.out.println(solve(arr, len));
        }
    }

    private static int solve(int[] arr, int len) {
        int[] cache = new int[len];
        Arrays.fill(cache, -1);

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, solve(arr, cache, i));
        }

        return max;
    }

    private static int solve(int[] arr, int[] cache, int start) {
        if (start >= arr.length) return 0;

        if (cache[start] != -1) return cache[start];

        int max = 1;
        for (int next = start+1; next < arr.length; next++) {
            if (arr[start] < arr[next]) {
                max = Math.max(solve(arr, cache, next)+1, max);
            }
        }

        return cache[start] = max;
    }
}
