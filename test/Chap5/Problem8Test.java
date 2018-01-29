package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem8Test {
    Problem8 p = new Problem8();

    @Test
    public void test() {
        byte[] screen = new byte[] {
                64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79
        };

        assertArrayEquals(screen, p.drawLine(screen, 8, 0, 30, 0));

    }
}
