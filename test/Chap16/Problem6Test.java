package Chap16;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem6Test {
    Problem6 p6;

    @Before
    public void before() {
        this.p6 = new Problem6();
    }

    @Test
    public void finalTest() {
        assertEquals(3, p6.getMinAbsValueOfMinusBetween(
                new int[] {1, 3, 15, 11, 2},
                new int[] {23, 127, 235, 19, 8})
        );
    }

    @Test
    public void boundary() {
        assertEquals(0, p6.getMinAbsValueOfMinusBetween(
                new int[] {0},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetween(
                new int[] {0, 0},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetween(
                new int[] {1, 0},
                new int[] {0})
        );

        assertEquals(1, p6.getMinAbsValueOfMinusBetween(
                new int[] {1, 1, 1},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetween(
                new int[] {100},
                new int[] {100})
        );
    }

    @Test
    public void order() {
        assertEquals(0, p6.getMinAbsValueOfMinusBetween(
                new int[] {1, 2, 3, 4, 5},
                new int[] {1, 2, 3, 4, 5})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetween(
                new int[] {5, 4, 3, 2, 1},
                new int[] {1, 2, 3, 4, 5})
        );
    }
}
