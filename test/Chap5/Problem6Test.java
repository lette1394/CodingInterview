package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {
    Problem6 p = new Problem6();

    @Test
    public void test() {
        int from = 29;
        int to = 15;

        assertEquals(2, p.solve(from, to));
        assertEquals(3, p.solve(394, 128));
        assertEquals(7, p.solve(124, 5968));
        assertEquals(24, p.solve(124, -5968));
    }

    @Test
    public void boundary() {
        int from = 0;
        int to = -1;

        assertEquals(31, p.solve(from, to));
    }
}
