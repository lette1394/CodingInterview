package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UnderStairs {
    private int[][] grid;
    private int[][] cache;

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    int count(int[][] grid) {
        this.grid = grid;
        this.cache = new int[500][500];

        for (int[] aCache : cache) {
            Arrays.fill(aCache, -1);
        }

        return count(0, 0);
    }

    private int count(int x, int y) {
        if (cache[y][x] > 0) {
            return cache[y][x];
        }

        if (isArrived(x, y)) {
            return 1;
        }

        if (cache[y][x] == -1) {
            cache[y][x] = 0;
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (isValid(nx, ny, grid[y][x])) {
                    cache[y][x] += count(nx, ny);
                }
            }
        }

        return cache[y][x];
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
