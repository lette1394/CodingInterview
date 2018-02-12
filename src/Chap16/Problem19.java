package Chap16;

import java.util.ArrayList;
import java.util.List;

public class Problem19 {

    private int[] nextX = new int[] {0, 0, -1, 1, 1, -1, -1, 1};
    private int[] nextY = new int[] {1, -1, 0, 0, -1, 1, -1, 1};

    public List<Integer> solve(int[][] grid) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count(grid, result, i, j);
            }
        }

        return result;
    }

    private void printArray(int[][] grid) {
        for (int[] array : grid) {
            for (int i : array) {
                System.out.print("\t" + i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void count(int[][] grid, List<Integer> list, int y, int x) {
        int result = tracePond(grid, y, x);
        if (result != 0) {
            list.add(result);
        }
    }

    private int tracePond(int[][] grid, int y, int x) {
        if (isNotValid(grid, y, x)) {
            return 0;
        }

        if (grid[y][x] != 0 || grid[y][x] == -1) {
            return 0;
        }

        assert(grid[y][x] == 0);
        grid[y][x] = -1;

        int result = 0;
        int i = 0;
        int j = 0;
        for (; i < nextY.length ;) {
            result += tracePond(grid, y+nextY[i], x+nextX[j]);
            i++;
            j++;
        }

        return result + 1;
    }

    private boolean isNotValid(int[][] grid, int y, int x) {
        return !(y >= 0 && y < grid.length && x >= 0 && x < grid[0].length);
    }

}
