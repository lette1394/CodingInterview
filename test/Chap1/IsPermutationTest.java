package Chap1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class IsPermutationTest {

    IsPermutation instance;

    @Before
    public void setUp() {
         this.instance = new IsPermutation();
    }

    @Test
    public void blank() {
        assertTrue(instance.isPermuation("", ""));
    }

    @Test
    public void one() {
        assertFalse(instance.isPermuation("z", "a"));
        assertFalse(instance.isPermuation(" ", "a"));
        assertFalse(instance.isPermuation("z", " "));

        assertTrue(instance.isPermuation("a", "a"));
    }

    @Test
    public void more() {
        assertTrue(instance.isPermuation("ab", "ab"));
        assertTrue(instance.isPermuation("ab", "ba"));

        assertTrue(instance.isPermuation("abc", "abc"));
        assertTrue(instance.isPermuation("abc", "acb"));
        assertTrue(instance.isPermuation("abc", "bac"));
        assertTrue(instance.isPermuation("abc", "bca"));
        assertTrue(instance.isPermuation("abc", "cab"));
        assertTrue(instance.isPermuation("abc", "cba"));

        assertFalse(instance.isPermuation("kkk", "kka"));
        assertTrue(instance.isPermuation("kkkaakk", "kkkkaak"));
    }

    @Test
    public void dup() {
        assertTrue(instance.isPermuation("abcadd", "ddcaba"));
        assertTrue(instance.isPermuation("kkia", "akik"));
    }

    @Test
    public void diff_length() {
        assertFalse(instance.isPermuation("kkk", "kkkk"));
        assertFalse(instance.isPermuation("abdc", "abc"));

    }
}
