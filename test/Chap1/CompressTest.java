package Chap1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CompressTest {
    private Compress com = new Compress();

    @Test
    public void CommpressTest() {
        assertEquals("a5", com.compress("aaaaa"));
        assertEquals("abc", com.compress("abc"));
        assertEquals("a", com.compress("a"));
        assertEquals("", com.compress(""));
        assertEquals(" ", com.compress(" "));
        assertEquals("a2b1c8a3", com.compress("aabccccccccaaa"));
    }
}
