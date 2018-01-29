package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem4Test {
    Problem4 p = new Problem4();

    @Test
    public void test() {
        assertEquals("", p.solve(7));
        assertEquals("", p.solve(1234));
        assertEquals("", p.solve(44));
    }
}
