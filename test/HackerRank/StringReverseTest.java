package HackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse s = new StringReverse();

    @Test
    public void test() {
        assertEquals("Yes", s.solve("a"));
        assertEquals("Yes", s.solve("aba"));
        assertEquals("Yes", s.solve("aabaa"));
        assertEquals("No", s.solve("ab"));
        assertEquals("No", s.solve("aaabbcaa"));
    }
}
