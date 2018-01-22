package BOJ;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class PrintStormTest {

    PrintStorm ps;

    @Before
    public void before() {
        ps = new PrintStorm();
    }

    @Test
    public void mainTest() {
        String input = "-3 -3 2 0\n";
        simulateSTDIN(input);

        assertArrayEquals(new int[][] {
                {37, 36, 35, 34, 33, 32, 31},
                {38, 17, 16, 15, 14, 13, 30},
                {39, 18,  5,  4,  3, 12, 29},
                {40, 19,  6,  1,  2, 11, 28},
                {41, 20,  7,  8,  9, 10, 27},
                {42, 21, 22, 23, 24, 25, 26},
                {43, 44, 45, 46, 47, 48, 49},
        }, ps.solve());
    }

    private void simulateSTDIN(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void boundaryZero() {
        String input = "0 0 0 0\n";
        simulateSTDIN(input);

        assertArrayEquals(new int[][] {
                {1}
        }, ps.solve());
    }

    @Test
    public void boundaryNarrowOne() {
        String input = "0 0 1 0\n";
        simulateSTDIN(input);

        assertArrayEquals(new int[][] {
                {1, 0},
                {0, 0}
        }, ps.solve());
    }

    @Test
    public void boundaryWideOne() {
        String input = "0 0 0 1\n";
        simulateSTDIN(input);

        assertArrayEquals(new int[][] {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, ps.solve());
    }

    @Test
    public void boundarySquare() {
        String input = "0 0 1 1\n";
        simulateSTDIN(input);

        assertArrayEquals(new int[][] {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, ps.solve());
    }
}
