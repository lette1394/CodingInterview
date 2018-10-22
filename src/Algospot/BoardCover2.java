package Algospot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoardCover2 {
    static int[][][] shape = new int[][][]{
            {{0, 0}, {0, 1}, {1, 0}},
            {{0, 0}, {0, 1}, {1, 1}},
            {{0, 0}, {1, 0}, {1, 1}},
            {{0, 0}, {1, 0}, {1, -1}},
    };

    public static void main(String[] args) throws Exception {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < testCases; t++) {
            StringTokenizer st = new StringTokenizer(in.readLine().trim());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            char[][] grid = new char[H][W];

            for (int i = 0; i < H; i++) {
                String line = in.readLine().trim();
                for (int j = 0; j < W; j++) {
                    grid[i][j] = line.toCharArray()[j];
                }
            }

            System.out.println(solve(grid, 0, 0));
        }
    }

    private static int solve(char[][] grid, int y, int x) {
//        System.out.print(x + " ");
//        System.out.println(y);

        if (isEnd(grid, y, x)) {
            return 1;
        }
        if (!isValid(grid, y, x)) {
            return 0;
        }
        int nextY = y + ((x + 1) / grid[0].length);
        int nextX = (x + 1) % grid[0].length;

        if (grid[y][x] == '#') {
            return solve(grid, nextY, nextX);
        }

        int ret = 0;
        for (int i = 0; i < 4; i++) {
            if (setGrid(grid, y, x, shape[i])) {
                ret += solve(grid, nextY, nextX);

                unSetGrid(grid, y, x, shape[i]);
            }
        }

        return ret;
    }

    private static void unSetGrid(char[][] grid, int y, int x, int[][] shape) {
        for (int[] index : shape) {
            int ny = y + index[0];
            int nx = x + index[1];

            grid[ny][nx] = '.';
        }
    }

    private static boolean isEnd(char[][] grid, int y, int x) {
        return y == grid.length && x == 0;
    }

    private static boolean setGrid(char[][] grid, int y, int x, int[][] shape) {
        for (int[] index : shape) {
            int ny = y + index[0];
            int nx = x + index[1];

            if (!isValid(grid, ny, nx)) {
                return false;
            }
            if (grid[ny][nx] == '#') {
                return false;
            }
        }

        for (int[] index : shape) {
            int ny = y + index[0];
            int nx = x + index[1];

            grid[ny][nx] = '#';
        }

        return true;
    }

    private static boolean isValid(char[][] grid, int y, int x) {
        return 0 <= x && 0 <= y && y < grid.length && x < grid[0].length;
    }
}
