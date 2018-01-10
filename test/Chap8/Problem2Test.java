package Chap8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {
    Problem2 p2;

    @Before
    public void before() {
        p2 = new Problem2();
    }

    @Test
    public void init1() {
        p2.setGrid(new int[][] {
                {0, 0},
                {0, 0}
        });

        assertArrayEquals(new int[][] {
                {0, 0},
                {0, 0}
        }, p2.grid);
    }

    @Test
    public void init2() {
        p2.setGrid(new int[][] {
                {1, 0},
                {0, 1}
        });

        assertArrayEquals(new int[][] {
                {1, 0},
                {0, 1}
        }, p2.grid);
    }

    @Test
    public void countBoundary() {
        assertEquals(1, p2.getCountOf(
                new int[][] {
                        {0}
                }));

        assertEquals(0, p2.getCountOf(
                new int[][] {
                        {1}
                }));

        assertEquals(1, p2.getCountOf(
                new int[][] {
                        {0, 0}
                }));

        assertEquals(1, p2.getCountOf(
                new int[][] {
                        {0},
                        {0}
                }));
    }

    @Test
    public void mainTest() {
        assertEquals(27, p2.getCountOf(
                new int[][] {
                        {0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}
                }));

        assertEquals(17, p2.getCountOf(
                new int[][] {
                        {0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}
                }));

        assertEquals(12, p2.getCountOf(
                new int[][]  {
                        {0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}
                }));

        assertEquals(8, p2.getCountOf(
                new int[][]  {
                        {0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0}
                }));
    }
}
