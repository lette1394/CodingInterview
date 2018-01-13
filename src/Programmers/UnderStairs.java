package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UnderStairs {
    private int[][] grid;
    private int[][] cache;

    int count(int[][] grid) {
        this.grid = grid;
        this.cache = new int[500][500];

        for (int[] aCache : cache) {
            Arrays.fill(aCache, -1);
        }

        return count(0, 0);
    }

    private int count(int x, int y) {
        int result = 0;
        int currentValue = grid[y][x];

        if (isArrived(x, y)) {
            return 1;
        }

        if (cache[y][x] > 0) {
            return cache[y][x];
        }

        if (cache[y][x] == -1) {
            cache[y][x] = 0;

            if (isValid(x + 1, y, currentValue)) {
                result += count(x + 1, y);
            }
            if (isValid(x - 1, y, currentValue)) {
                result += count(x - 1, y);
            }
            if (isValid(x, y + 1, currentValue)) {
                result += count(x, y + 1);
            }
            if (isValid(x, y - 1, currentValue)) {
                result += count(x, y - 1);
            }
        }
        return cache[y][x] = result;
    }

    private boolean isValid(int x, int y, int currentValue) {
        return isUnderBoundary(x, y) && isToDownSide(x, y, currentValue);
    }

    private boolean isUnderBoundary(int x, int y) {
        return 0 <= x && x < grid[0].length && 0 <= y && y < grid.length;
    }

    private boolean isArrived(int x, int y) {
        return x == grid[0].length-1 && y == grid.length-1;
    }

    private boolean isToDownSide(int x, int y, int beforeValue) {
        return grid[y][x] < beforeValue;
    }

    int[][] parse() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < col; j++) {
                result[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        UnderStairs u = new UnderStairs();
        int[][] grid = u.parse();

        System.out.println(u.count(grid));
    }
}
