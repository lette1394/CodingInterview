package Algospot;

import java.util.*;
import java.io.*;

public class JumpGame {
    public static void main(String[] args) {
        final InputStreamReader reader = new InputStreamReader(System.in);
        final BufferedReader in = new BufferedReader(reader);

        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int testCases = Integer.parseInt(st.nextToken());

            for (int t = 0; t < testCases; t++) {
                st = new StringTokenizer(in.readLine());
                int size = Integer.parseInt(st.nextToken());

                char[][] grid = new char[size][size];
                for (int y = 0; y < size; y++) {
                    st = new StringTokenizer(in.readLine());

                    for (int x = 0; x < size; x++) {
                        grid[y][x] = (char)Integer.parseInt(st.nextToken());
                    }
                }

                System.out.println(solve(grid, size));

            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    private static String solve(char[][] grid, int size) {
        int[][] dp = new int[size][size];
        for(int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        return solve(grid, dp, 0, 0) ? "YES" : "NO";
    }

    private static boolean solve(char[][] grid, int[][] dp, int y, int x) {
        if (!isValid(grid, y, x)) return false;
        if (isArrived(grid, y, x)) return true;

        if (dp[y][x] != -1) return dp[y][x] != 0;

        int next = grid[y][x];
        boolean result = solve(grid, dp, y+next, x) || solve(grid, dp, y, x+next);
        dp[y][x] = result ? 1 : 0;

        return result;
    }

    private static boolean isArrived(char[][] grid, int y, int x) {
        return y == grid.length-1 && x == grid[0].length-1;
    }

    private static boolean isValid(char[][] grid, int y, int x) {
        return y >= 0 && x >= 0 && y < grid.length && x < grid[0].length;
    }
}
