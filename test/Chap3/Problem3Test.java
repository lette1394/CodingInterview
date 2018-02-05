package Chap3;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

public class Problem3Test {
    Problem3 p = new Problem3();

    @Test
    public void test() {
        p.push(1);
        p.push(12);
        p.push(123);
        p.push(1234);
        p.push(12345);

        assertEquals(12345, p.peek());
        assertEquals(12345, p.pop());
        assertEquals(1234, p.pop());
        assertEquals(123, p.pop());
        assertEquals(12, p.peek());
        assertEquals(12, p.pop());
        assertEquals(1, p.pop());
    }

    @Test
    public void test2() {
        p.push(0);
        p.push(0);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        p.push(6);
        p.push(7);
        p.push(8);
        p.push(9);

        assertEquals(9, p.pop());
        assertEquals(8, p.pop());
        assertEquals(7, p.pop());
        assertEquals(6, p.pop());
        assertEquals(5, p.pop());
        assertEquals(4, p.pop());
        assertEquals(3, p.pop());
        assertEquals(2, p.pop());
        assertEquals(1, p.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void exception() {
        assertEquals(1, p.pop());
        assertEquals(1, p.peek());
    }


}
