package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem3Test {
    Problem3 p = new Problem3();

    @Test
    public void test() {
        assertEquals(8, p.solve("1775"));
        assertEquals(3, p.solve("12945"));
    }

    @Test
    public void index() {
        assertEquals(2, "110".indexOf("0"));
        assertEquals(2, "110110".indexOf("0"));
        assertEquals(5, "110110".indexOf("0",3));
        assertEquals(-1, "110110".indexOf("0",6));
    }
}
