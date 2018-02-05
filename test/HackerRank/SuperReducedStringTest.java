package HackerRank;

import org.junit.Test;
import static org.junit.Assert.*;

public class SuperReducedStringTest {
    SuperReducedString s = new SuperReducedString();

    @Test
    public void empty() {
        assertEquals("Empty String", SuperReducedString.super_reduced_string(""));
        assertEquals("Empty String", SuperReducedString.super_reduced_string("aa"));
        assertEquals("Empty String", SuperReducedString.super_reduced_string("bb"));
        assertEquals("ab", SuperReducedString.super_reduced_string("ab"));
    }

    @Test
    public void one() {
        assertEquals("a", SuperReducedString.super_reduced_string("a"));
        assertEquals("b", SuperReducedString.super_reduced_string("b"));
    }

    @Test
    public void two() {
        assertEquals("Empty String", SuperReducedString.super_reduced_string("baab"));
        assertEquals("b", SuperReducedString.super_reduced_string("b"));
    }

    @Test
    public void isPair() {
        assertTrue(SuperReducedString.getPair("aa").exist);
        assertEquals(0, SuperReducedString.getPair("aa").index);

        assertTrue(SuperReducedString.getPair("abba").exist);
        assertEquals(1, SuperReducedString.getPair("abba").index);

        assertFalse(SuperReducedString.getPair("").exist);
        assertEquals(-1, SuperReducedString.getPair("").index);

        assertFalse(SuperReducedString.getPair("abc").exist);
        assertEquals(-1, SuperReducedString.getPair("abc").index);
    }

    @Test
    public void main() {
        assertEquals("abd", SuperReducedString.super_reduced_string("aaabccddd"));
    }
}
