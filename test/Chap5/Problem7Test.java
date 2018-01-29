package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem7Test {
    Problem7 p = new Problem7();

    @Test
    public void boundary() {
        assertEquals("0", p.solve(0));
        assertEquals("1", p.solve(2));
        assertEquals("10", p.solve(1));
        assertEquals("11", p.solve(3));
    }
}
