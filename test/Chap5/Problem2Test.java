package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    Problem2 p = new Problem2();

    @Test
    public void test() {
        assertEquals("101", p.solve(0.625));
        assertEquals("1101", p.solve(0.8125));
        assertEquals("1101", p.solve(0.95));
    }

    @Test
    public void mainTest() {
        assertEquals("ERROR", p.solve(0.72));
    }

}
