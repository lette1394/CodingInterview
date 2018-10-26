package LeetCode;

import java.util.Arrays;

public class MinimumPathSum {
    // cannot pass last input. (very large input)
    // top-down
    class MySolution {
        int finX;
        int finY;
        int ret;
        int[][] cache;

        public int minPathSum(int[][] grid) {
            finX = grid[0].length - 1;
            finY = grid.length - 1;
            ret = 987654321;
            cache = new int[finY+5][finX+5];
            for (int[] c: cache) {
                Arrays.fill(c, -1);
            }

            minPathSum(grid, 0, 0, 0);

            return ret;
        }

        boolean inRange(int y, int x) {
            return 0 <= x && x <= finX && 0 <= y && y <= finY;
        }

        void minPathSum(int[][] grid, int y, int x, int acc) {
            if (acc >= cache[y][x] && cache[y][x] != -1) return ;
            if (acc >= ret) return ;
            if (x == finX && y == finY) {
                ret = Math.min(ret, acc + grid[y][x]);
                cache[y][x] = ret;
                return ;
            }
            if (!inRange(y, x)) return ;

            int nextAcc = acc + grid[y][x];
            minPathSum(grid, y, x+1, nextAcc);
            minPathSum(grid, y+1, x, nextAcc);

        }
    }



    // should rewrite above code to iteration code. (typically called DP solution)
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            int[][] dp = new int[m+2][n+2];

            dp[0][0] = grid[0][0];
            for (int i = 1; i < grid.length; i++) {
                dp[i][0] = dp[i-1][0] + grid[i][0];
            }
            for (int i = 1; i< grid[0].length; i++) {
                dp[0][i] = dp[0][i-1] + grid[0][i];
            }

            for (int y = 1; y < m; y++) {
                for (int x = 1; x < n; x++) {
                    dp[y][x] = Math.min(dp[y-1][x], dp[y][x-1]) + grid[y][x];
                }
            }

            return dp[m-1][n-1];
        }
    }

}
