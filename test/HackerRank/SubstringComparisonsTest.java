package HackerRank;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringComparisonsTest {
    SubstringComparisons s = new SubstringComparisons();

    @Test
    public void getString() {
        assertEquals("abc", s.getSubstring("qweabcty".toCharArray(), 3, 3));
    }

    @Test
    public void main() {
        assertEquals("abc\nwea", s.getSmallestAndLargest("qweabcty", 3));
    }

    @Test
    public void main2() {
        assertEquals("ava\nwel", s.getSmallestAndLargest("welcometojava", 3));
    }
}
