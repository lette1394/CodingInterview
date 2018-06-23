package BOJ;

import java.io.*;
import java.util.*;

public class CardGame {
    private static int[][][] cache = new int[2][1001][1001];

    private static int solve(int[] arr) {
        for (int[][] ints : cache) {
            for (int[] intss : ints) {
                Arrays.fill(intss, -1);
            }
        }
        return solve(arr, 0, arr.length-1, true);
    }

    private static int solve(int[] arr, int left, int right, boolean turn) {
        if (left > right) {
            return 0;
        }

        if (cache[turn ? 1:0][left][right] != -1) {
            return cache[turn ? 1:0][left][right];
        }


        if (turn) {
            return cache[1][left][right] = Math.max(
                    solve(arr, left+1, right, false) + arr[left],
                    solve(arr, left, right-1, false) + arr[right]);

        } else {
            return cache[0][left][right] = Math.min(
                    solve(arr, left+1, right, true),
                    solve(arr, left, right-1, true));
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        int testCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < testCases; i++) {
            int size = Integer.parseInt(in.readLine());
            int[] arr = new int[size];
            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(arr));
        }
    }
}