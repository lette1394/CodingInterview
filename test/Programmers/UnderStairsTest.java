package Programmers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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

}
