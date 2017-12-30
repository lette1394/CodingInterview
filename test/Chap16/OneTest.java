package Chap16;

import org.junit.Test;
import static org.junit.Assert.*;

public class OneTest {

    @Test(timeout = 20)
    public void helloWorld() {
        assertEquals("hello world!", One.ex1());
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[] {0, 1, 2}, One.arrays());
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[] {1, 2, 3}, One.arrays2());
    }
}


