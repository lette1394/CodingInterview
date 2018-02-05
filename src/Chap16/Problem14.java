package Chap16;

import java.util.*;

public class Problem14 {

    class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int getMostOftenIncline(int[][] grid) {
        Map<Double, Integer> map = getInclines(grid);
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

        return max+1;
    }

    Map<Double, Integer> getInclines(int[][] grid) {
        Map<Double, Integer> map = new HashMap<>();
        int[] base = getBaseIndex(grid);

        System.out.println("base: " + Arrays.toString(base));

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }

                double incline = getIncline(base, new Point(j, getY(grid, i)));

                if (map.containsKey(incline)) {
                    map.put(incline, map.get(incline)+1);
                } else {
                    map.put(incline, 1);
                }
            }
        }

        return map;
    }

    private Double getIncline(int[] base, Point point) {
        double baseX = base[0];
        double baseY = base[1];

        return (baseY-point.y) / (baseX-point.x);
    }

    int[] getBaseIndex(int[][] grid) {
        for (int k = 0; k < grid.length; k++) {
            for (int x = 0; x <= k; x++) {
                int y = getY(grid, k-x);

                if (grid[y][x] == 1) {
                    return new int[] {x, getY(grid, y)};
                }
            }
        }

        return new int[] {-1, -1};
    }

    int getY(int[][] grid, int y) {
        return grid.length-y-1;
    }
}
