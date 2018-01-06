package Chap16;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem5Test {

    Problem5 problem5;

    @Before
    public void before() {
        this.problem5 = new Problem5();
    }

    @Test
    public void 계승_계산() {
        assertEquals(1, problem5.getFactorial(0));
        assertEquals(1, problem5.getFactorial(1));
        assertEquals(2, problem5.getFactorial(2));
        assertEquals(6, problem5.getFactorial(3));
        assertEquals(24, problem5.getFactorial(4));
        assertEquals(120, problem5.getFactorial(5));
    }
}


