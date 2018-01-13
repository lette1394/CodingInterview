package Programmers;

import java.util.Stack;

public class UnderStairs {
    int[][] grid;

    int count(int[][] grid) {
        this.grid = grid;

        return count(0, 0, 999999);
    }

    int count(int x, int y, int pre) {
        int result = 0;

        if (!isDownSide(x, y, pre)) {
            return 0;
        }

        if (isArrived(x, y)) {
            return 1;
        }

        if (isValid(x+1, y)) {
            result += count(x+1, y, grid[y][x]);
        }
        if (isValid(x-1, y)) {
            result += count(x-1, y, grid[y][x]);
        }
        if (isValid(x, y+1)) {
            result += count(x, y+1, grid[y][x]);
        }
        if (isValid(x, y-1)) {
            result += count(x, y-1, grid[y][x]);
        }
        return result;
    }

    private boolean isValid(int x, int y) {
        return 0 <= x && x < grid[0].length && 0 <= y && y < grid.length;
    }

    private boolean isArrived(int x, int y) {
        return x == grid[0].length-1 && y == grid.length-1;
    }

    private boolean isDownSide(int x, int y, int pre) {
        return grid[y][x] < pre;
    }
}
