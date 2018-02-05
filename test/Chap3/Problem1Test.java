package Chap3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {
    Problem1 p = new Problem1();

    @Test
    public void test() {
        p.push(1, Number.FIRST);
        p.push(2, Number.FIRST);
        p.push(3, Number.FIRST);

        p.push(4, Number.SECOND);
        p.push(5, Number.SECOND);
        p.push(6, Number.SECOND);

        assertEquals(3, p.pop(Number.FIRST));
        assertEquals(2, p.pop(Number.FIRST));
        assertEquals(6, p.pop(Number.SECOND));
        assertEquals(5, p.pop(Number.SECOND));
        assertEquals(4, p.pop(Number.SECOND));
    }
}
