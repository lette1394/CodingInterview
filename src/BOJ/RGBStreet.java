package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RGBStreet {

    private static int[][] cache;

    public static int solve2(int[][] arr) {

        cache = new int[arr.length][arr[0].length];
        int size = arr.length-1;

        for (int i = 0; i < 3; i++) {
            cache[size][i] = arr[size][i];
        }

        for (int i = arr.length-1; i > 0 ; i--) {
            cache[i-1][0] = Math.min(cache[i][1], cache[i][2]) + arr[i-1][0];
            cache[i-1][1] = Math.min(cache[i][0], cache[i][2]) + arr[i-1][1];
            cache[i-1][2] = Math.min(cache[i][0], cache[i][1]) + arr[i-1][2];
        }

        return Math.min(Math.min(cache[0][0], cache[0][1]), cache[0][2]);
    }

    public static int solve(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        cache = new int[arr.length][arr[0].length];
        init(cache);

        for (int i = 0; i < 3; i++) {
            min = Math.min(min, solve(arr, 0, i));
        }

        return min;
    }

    private static void init(int[][] cache) {
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
    }

    public static int solve(int[][] arr, int row, int col) {
        if (row >= arr.length) {
            return 0;
        }

        if (cache[row][col] != -1) {
            return cache[row][col];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            if (i == col) {
                continue;
            }
            min = Math.min(min, solve(arr, row+1, i) + arr[row][col]);
        }

        return cache[row][col] = min;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        int N = Integer.parseInt(in.readLine());
        int[][] arr = new int[N+1][3];

        arr[0][0] = 0;
        arr[1][0] = 0;
        arr[2][0] = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve2(arr));
    }
}
