package Chap3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem4Test {
    Problem4 p;

    @Before
    public void setup(){
        p = new Problem4();
    }

    @Test
    public void test2() {
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

        assertEquals(0, p.pop());
        assertEquals(1, p.pop());
        assertEquals(2, p.pop());
        assertEquals(3, p.pop());
        assertEquals(4, p.pop());
        assertEquals(5, p.pop());
        assertEquals(6, p.pop());
        assertEquals(7, p.pop());
        assertEquals(8, p.pop());
        assertEquals(9, p.pop());
    }

    @Test
    public void isEmptyTest() {
        assertTrue(p.isEmpty());

        p.push(1);
        p.pop();

        assertTrue(p.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
        assertTrue(p.isEmpty());

        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);
        p.push(1);
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        p.pop();

        assertTrue(p.isEmpty());
    }

    @Test
    public void peekTest() {
        p.push(1);
        assertEquals(1, p.peek());

        p.push(2);
        assertEquals(1, p.peek());
        p.push(3);
        assertEquals(1, p.peek());
        p.push(4);
        assertEquals(1, p.peek());

        p.pop();
        p.pop();

        assertEquals(3, p.peek());
    }

}
