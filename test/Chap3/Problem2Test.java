package Chap3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    Problem2 p = new Problem2();

    @Test
    public void test() {
        p.push(4);
        p.push(5);
        p.push(10);
        p.push(7);
        p.push(1);
        p.push(5);
        p.push(2);
        p.push(9);

        assertEquals(1, p.min());

        p.push(0);
        assertEquals(0, p.min());

    }
}
