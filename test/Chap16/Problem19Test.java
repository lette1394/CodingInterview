package Chap16;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Problem19Test {
    Problem19 p = new Problem19();

    @Test
    public void main() throws Exception {
        int[][] grid = new int[][] {
                {0, 2, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 1}
        };

        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(4);
        result.add(1);

        assertEquals(result, p.solve(grid));
    }

    @Test
    public void main2() throws Exception {
        int[][] grid = new int[][] {
                {0, 2, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1}
        };

        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(11);
        result.add(8);

        assertEquals(result, p.solve(grid));
    }

    @Test
    public void main3() throws Exception {
        int[][] grid = new int[][] {
                {0, 2, 1, 0, 3, 0},
                {0, 1, 0, 1, 1, 3},
                {1, 1, 0, 1, 0, 9},
                {0, 2, 6, 1, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
        };

        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(3);
        result.add(1);
        result.add(9);
        result.add(7);

        assertEquals(result, p.solve(grid));
    }

    @Test
    public void main4() throws Exception {
        int[][] grid = new int[][] {
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {0, 1, 1, 0},
        };

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);
        result.add(1);

        assertEquals(result, p.solve(grid));
    }

    @Test
    public void main5() throws Exception {
        int[][] grid = new int[][] {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
        };

        List<Integer> result = new ArrayList<>();
        result.add(13);

        assertEquals(result, p.solve(grid));
    }
}
