package HackerRank;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramsTest {
    Anagrams a = new Anagrams();

    @Test
    public void name() throws Exception {
        assertFalse(Anagrams.isAnagram("anagramm", "marganaa"));
        assertTrue(Anagrams.isAnagram("Hello", "hello"));
    }
}
