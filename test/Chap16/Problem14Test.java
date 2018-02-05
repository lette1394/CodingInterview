package Chap16;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Problem14Test {
    int[][] grid;
    Problem14 p = new Problem14();

    public void parse() {
        File file = new File("./resources/test/Chap16_Problem14.txt");

        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            int size = sc.nextInt();
            int nodes = sc.nextInt();

            grid = new int[size][size];
            for (int i = 0; i < nodes; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                grid[size-y-1][x] = 1;
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    void printArrays(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void main() {
        parse();
        //printArrays(grid);

        System.out.println(p.getMostOftenIncline(grid));
    }

    @Test
    public void getBase() {
        parse();
        int[] indexs = p.getBaseIndex(grid);

        assertArrayEquals(new int[] {1, 1}, indexs);
    }

    @Test
    public void getY() {
        parse();
        assertEquals(0, p.getY(grid, 12));
        assertEquals(1, p.getY(grid, 11));
        assertEquals(2, p.getY(grid, 10));
    }

}
