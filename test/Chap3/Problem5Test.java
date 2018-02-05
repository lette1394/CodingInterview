package Chap3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem5Test {
    Problem5 p = new Problem5();

    @Test
    public void test() {
        p.push(4);
        p.push(2);
        p.push(7);
        p.push(1);
        p.push(3);
        p.push(5);
        p.push(9);
        p.push(0);
        p.push(-2);

        assertEquals(-2, p.pop());
        assertEquals(0, p.pop());
        assertEquals(1, p.pop());
        assertEquals(2, p.pop());
        assertEquals(3, p.pop());
        assertEquals(4, p.pop());
        assertEquals(5, p.pop());
        assertEquals(7, p.pop());
        assertEquals(9, p.pop());



    }

}
