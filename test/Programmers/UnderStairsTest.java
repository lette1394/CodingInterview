package Programmers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class UnderStairsTest {

    UnderStairs u;

    @Before
    public void before() {
        this.u = new UnderStairs();
    }

    @Test
    public void test() {
        assertEquals(3, u.count(new int[][] {
                {50, 45, 37, 32, 30},
                {35, 50, 40, 20, 25},
                {30, 30, 25, 17, 28},
                {27, 24, 22, 15, 10}
        }));
    }

    @Test
    public void bondary() {
        assertEquals(1, u.count(new int[][] {
                {0}
        }));

        assertEquals(0, u.count(new int[][] {
                {0, 0}
        }));

        assertEquals(1, u.count(new int[][] {
                {1, 0}
        }));

        assertEquals(1, u.count(new int[][] {
                {1},
                {0}
        }));

        assertEquals(2, u.count(new int[][] {
                {2, 1},
                {1, 0}
        }));
    }

    @Test
    public void three() {
        assertEquals(1, u.count(new int[][] {
                {5, 4, 3},
                {0, 0, 2},
                {0, 0, 1}
        }));

        assertEquals(1, u.count(new int[][] {
                {3, 2, 1},
                {1, 0, 0}
        }));
    }

    @Test
    public void parseFromSTDIN() throws IOException {
        String data = "4 5\n" +
                "50 45 37 32 30\n" +
                "35 50 40 20 25\n" +
                "30 30 25 17 28\n" +
                "27 24 22 15 10";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        assertArrayEquals(new int[][] {
                {50, 45, 37, 32, 30},
                {35, 50, 40, 20, 25},
                {30, 30, 25, 17, 28},
                {27, 24, 22, 15, 10}
        }, u.parse());
    }
}
