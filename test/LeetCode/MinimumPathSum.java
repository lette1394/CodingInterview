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


}
