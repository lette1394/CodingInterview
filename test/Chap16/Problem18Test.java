package Chap16;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem18Test {
    Problem18 p = new Problem18();

    @Test
    public void zero() throws Exception {
        assertEquals(false, p.doesMatch("", ""));
    }

    @Test
    public void one() throws Exception {
        assertEquals(true, p.doesMatch("a", "a"));
        assertEquals(true, p.doesMatch("c", "a"));
        assertEquals(true, p.doesMatch("hellohelloworld", "aab"));
        assertEquals(true, p.doesMatch("hellohelloworld", "a"));
        assertEquals(true, p.doesMatch("hellohelloworld", "b"));
        assertEquals(false, p.doesMatch("hellohelloworld", "aba"));
        assertEquals(true, p.doesMatch("hellohelloworld", "bba"));
    }

    @Test
    public void singleWord() throws Exception {
        assertEquals(Arrays.asList("cat", "cat", "cat", "cat"), p.findRepeatedWords("catcatcatcat"));
    }

    @Test
    public void doubleWords() throws Exception {
        assertEquals(Arrays.asList("catgo", "catgo"), p.findRepeatedWords("catgocatgo"));
    }

    @Test
    public void main() throws Exception {
        assertEquals(true, p.doesMatch("catcatgocatgo", "a"));
        assertEquals(true, p.doesMatch("catcatgocatgo", "ab"));
        assertEquals(true, p.doesMatch("catcatgocatgo", "b"));
        assertEquals(true, p.doesMatch("catcatgocatgo", "aabab"));
    }

    @Test
    public void main2() throws Exception {
        assertEquals(true, p.doesMatch("catgocatcatgo", "a"));
        assertEquals(true, p.doesMatch("catgocatcatgo", "ab"));
        assertEquals(true, p.doesMatch("catgocatcatgo", "b"));
        assertEquals(true, p.doesMatch("catgocatcatgo", "abaab"));
    }

    @Test
    public void main3() throws Exception {
        assertEquals(true, p.doesMatch("hahahoohahahoo", "aab"));
    }

    @Test
    public void main4() throws Exception {
        assertEquals(true, p.doesMatch("hahahoohahahahaha", "a"));
        assertEquals(true, p.doesMatch("hahahoohahahahaha", "b"));
        assertEquals(true, p.doesMatch("hahahoohahahahaha", "aabaaaaa"));
    }

    @Test
    public void main5() throws Exception {
        String ex1 = "catcatgocatgo";
        assertEquals(true, p.doesMatch(ex1, "aabab"));
        assertEquals(true, p.doesMatch(ex1, "a"));
        assertEquals(true, p.doesMatch(ex1, "ab"));
        assertEquals(true, p.doesMatch(ex1, "abb"));
        assertEquals(false, p.doesMatch(ex1, "aaa"));
        assertEquals(false, p.doesMatch(ex1, "bb"));
        assertEquals(false, p.doesMatch(ex1, "baba"));
    }
}
