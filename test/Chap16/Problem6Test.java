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
    public void finalBRUTE() {
        assertEquals(3, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {1, 3, 15, 11, 2},
                new int[] {23, 127, 235, 19, 8})
        );
    }
    @Test
    public void finalSORT() {
        assertEquals(3, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {1, 3, 15, 11, 2},
                new int[] {23, 127, 235, 19, 8})
        );
    }

    @Test
    public void boundaryBRUTE() {
        assertEquals(0, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {0},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {0, 0},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {1, 0},
                new int[] {0})
        );

        assertEquals(1, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {1, 1, 1},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {100},
                new int[] {100})
        );
    }

    @Test
    public void orderBRUTE() {
        assertEquals(0, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {1, 2, 3, 4, 5},
                new int[] {1, 2, 3, 4, 5})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenBRUTE(
                new int[] {5, 4, 3, 2, 1},
                new int[] {1, 2, 3, 4, 5})
        );
    }

    @Test
    public void boundarySROT() {
        assertEquals(0, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {0},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {0, 0},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {1, 0},
                new int[] {0})
        );

        assertEquals(1, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {1, 1, 1},
                new int[] {0})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {100},
                new int[] {100})
        );
    }

    @Test
    public void orderSORT() {
        assertEquals(0, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {1, 2, 3, 4, 5},
                new int[] {1, 2, 3, 4, 5})
        );

        assertEquals(0, p6.getMinAbsValueOfMinusBetweenSORT(
                new int[] {5, 4, 3, 2, 1},
                new int[] {1, 2, 3, 4, 5})
        );
    }

}
