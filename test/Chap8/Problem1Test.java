package Chap8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Problem1Test {
    Problem1 p1;

    @Before
    public void before() {
        p1 = new Problem1();
    }

    @Test
    public void zero() {
        assertEquals(0, p1.climbStairs(0));
    }

    @Test
    public void moreThanOne() {
        assertEquals(1, p1.climbStairs(1));
        assertEquals(2, p1.climbStairs(2));
        assertEquals(4, p1.climbStairs(3));
        assertEquals(7, p1.climbStairs(4));
        assertEquals(13, p1.climbStairs(5));
        assertEquals(24, p1.climbStairs(6));
        assertEquals(44, p1.climbStairs(7));
        assertEquals(81, p1.climbStairs(8));
        assertEquals(149, p1.climbStairs(9));
        assertEquals(274, p1.climbStairs(10));
    }

    @Test(timeout = 1000)
    public void speed() {
        assertEquals(53798080, p1.climbStairs(30));
    }
}
