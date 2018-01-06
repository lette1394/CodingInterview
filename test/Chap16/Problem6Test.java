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
}
