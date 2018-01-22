package BOJ;

import java.util.Scanner;

public class PrintStorm {
    int r1;
    int c1;
    int r2;
    int c2;
    int max;

    public int[][] solve() {
        int[][] array = createArray();

        array[Math.abs(r1)][Math.abs(c1)] = 1;

        for (int i = 1; i < Math.max(c2-c1, r2-r1); i++) {
            phase(array, i);
        }

        return array;
    }

    String readLine() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public int[][] createArray() {
        String input = readLine();
        String[] splited = input.split(" ");
        r1 = Integer.parseInt(splited[0]);
        c1 = Integer.parseInt(splited[1]);

        r2 = Integer.parseInt(splited[2]);
        c2 = Integer.parseInt(splited[3]);

        max = Math.max((c2 - c1)*2 + 1, r2 - r1 + 1);
        return new int[max][max];
    }

    void phase(int[][] grid, int stage) {
        int startValue = (2 * stage - 1) * (2 * stage - 1);
        int x = stage + Math.abs(r1) - 1;
        int y = stage + Math.abs(c1) - 1;

        int distance = (2 * stage - 1) - 1;
        int lastDistance = distance - 1;

        grid[y][x] = startValue;
        System.out.println(startValue);
        System.out.println("x : "+ x + ", " + "y : "+ y);

        for (int i = 0; i < distance; i++) {
            if (y < grid.length && x < grid[0].length && y > 0 && x > 0) {
                grid[y][--x] = --startValue;
            }
            System.out.println(startValue);
        }

        for (int i = 0; i < distance; i++) {
            if (y < grid.length && x < grid[0].length && y > 0 && x >= 0) {
                grid[--y][x] = --startValue;
            }
            System.out.println(startValue);
        }

        for (int i = 0; i < distance; i++) {
            if (y < grid.length && x < grid[0].length-1 && y >= 0 && x >= 0) {
                grid[y][++x] = --startValue;
            }
            System.out.println(startValue);
        }

        for (int i = 0; i < lastDistance; i++) {
            if (y < grid.length-1 && x < grid[0].length && y >= 0 && x >= 0) {
                grid[++y][x] = --startValue;
            }
            System.out.println(startValue);
        }
    }


}