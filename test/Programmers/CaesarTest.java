package Programmers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarTest {

    private Caesar caesar;

    @Before
    public void setUp() {
        caesar = new Caesar();
    }

    @Test
    public void test() {
        assertEquals("", caesar.caesar("", 0));
        assertEquals("", caesar.caesar("", 1));
        assertEquals("D", caesar.caesar("A", 3));
        assertEquals("B", caesar.caesar("Z", 2));
        assertEquals("a", caesar.caesar("z", 1));
        assertEquals("c", caesar.caesar("z", 3));
        assertEquals("a A a", caesar.caesar("b B b", -1));
        assertEquals("e F d", caesar.caesar("a B z", 4));
        assertEquals("e F d", caesar.caesar("a B z", 4));
    }
}
