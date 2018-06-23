package BOJ;

import java.util.*;
import java.io.*;

public class ConcatFiles {
    private static int[][] map;

    private static int solve(int[] cost, int[] sum) {
        map = new int[501][501];

        for (int right = 2; right < cost.length; right++) {
            for (int left = right-1; left > 0; left--) {

                map[left][right] = Integer.MAX_VALUE;
                for (int mid = left; mid < right; mid++) {
                    map[left][right] = Math.min(map[left][right], map[left][mid] + map[mid+1][right] + sum[right]-sum[left-1]);
                }
            }
        }

        return map[1][cost.length-1];
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        int testCases = Integer.parseInt(in.readLine());
        for (int i = 0; i < testCases; i++) {
            int K = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] cost = new int[K+1];
            int[] sum = new int[K+1];

            for (int j = 1; j < K+1; j++) {
               cost[j] = Integer.parseInt(st.nextToken());
               sum[j] = sum[j-1] + cost[j];
            }
            System.out.println(solve(cost, sum));
        }
        in.close();
    }
}
