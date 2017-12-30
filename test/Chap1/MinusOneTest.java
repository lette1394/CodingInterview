package Chap1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MinusOneTest {
    private MinusOne mo;

    //문자 삽입, 문자 교체, 문자 삭제
    @Before
    public void setUp() {
        this.mo = new MinusOne();
    }

    @Test
    public void blank() {
        assertEquals(true, mo.isValid("", ""));
        assertEquals(true, mo.isValid(" ", ""));
        assertEquals(true, mo.isValid("", " "));

        assertEquals(false, mo.isValid("  ", ""));
        assertEquals(false, mo.isValid("", "  "));
    }

    @Test
    public void one() {
        assertEquals(true, mo.isValid("a", ""));
        assertEquals(true, mo.isValid("", "a"));
        assertEquals(true, mo.isValid("a", "b"));
        assertEquals(true, mo.isValid("a", "ba"));
        assertEquals(true, mo.isValid("a", "ab"));

        assertEquals(true, mo.isValid("ab", "abc"));
        assertEquals(true, mo.isValid("ab", "b"));
        assertEquals(true, mo.isValid("ab", "ac"));
        assertEquals(true, mo.isValid("ab", "cb"));

        assertEquals(false, mo.isValid("a", "bb"));
        assertEquals(false, mo.isValid("a", "cg"));
        assertEquals(false, mo.isValid("a", "bab"));
        assertEquals(false, mo.isValid("a", "aaa"));
    }

    @Test
    public void more() {
        assertEquals(true, mo.isValid("pale", "ple"));
        assertEquals(false, mo.isValid("paby", "play"));
        assertEquals(true, mo.isValid("pales", "pale"));
        assertEquals(true, mo.isValid("pale", "bale"));

        assertEquals(false, mo.isValid("iceCream", "Cake"));
        assertEquals(true, mo.isValid("GreenTEA", "greenTEA"));
        assertEquals(false, mo.isValid("SONY", "THE_SONY"));
    }
}
