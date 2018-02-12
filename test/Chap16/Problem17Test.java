package Chap16;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem17Test {
    Problem17 p = new Problem17();

    @Test
    public void test() {
        int[] input = new int[] {2, -8, 3, -2, 4, -10};

        assertEquals(5, p.answer(input));
    }

    @Test
    public void test1() {
        int[] input = new int[] {1, 9, -2, 5, 3, 1, -1, -8, 3, -2, 0, -4, -10, 9};

        assertEquals(17, p.answer(input));
    }

    @Test
    public void test3() {
        int[] input = new int[] {-2, -8, -3, -2, -4, -10};

        assertEquals(0, p.answer(input));
    }
}
