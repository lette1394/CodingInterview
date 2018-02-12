package Chap16;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem18Test {
    Problem18 p = new Problem18();

    @Test
    public void zero() throws Exception {
        assertEquals(false, p.solve("", ""));
    }

    @Test
    public void one() throws Exception {
        assertEquals(true, p.solve("a", "a"));
        assertEquals(true, p.solve("c", "a"));
        assertEquals(true, p.solve("hellohelloworld", "aab"));
        assertEquals(true, p.solve("hellohelloworld", "a"));
        assertEquals(true, p.solve("hellohelloworld", "b"));
        assertEquals(false, p.solve("hellohelloworld", "aba"));
        assertEquals(true, p.solve("hellohelloworld", "bba"));
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
        assertEquals(true, p.solve("catcatgocatgo", "a"));
        assertEquals(true, p.solve("catcatgocatgo", "ab"));
        assertEquals(true, p.solve("catcatgocatgo", "b"));
        assertEquals(true, p.solve("catcatgocatgo", "aabab"));
    }

    @Test
    public void main2() throws Exception {
        assertEquals(true, p.solve("catgocatcatgo", "a"));
        assertEquals(true, p.solve("catgocatcatgo", "ab"));
        assertEquals(true, p.solve("catgocatcatgo", "b"));
        assertEquals(true, p.solve("catgocatcatgo", "abaab"));
    }

    @Test
    public void main3() throws Exception {
        assertEquals(true, p.solve("hahahoohahahoo", "aab"));
    }

    @Test
    public void main4() throws Exception {
        assertEquals(true, p.solve("hahahoohahahahaha", "a"));
        assertEquals(true, p.solve("hahahoohahahahaha", "b"));
        assertEquals(true, p.solve("hahahoohahahahaha", "aabaaaaa"));
    }

    @Test
    public void main5() throws Exception {
        String ex1 = "catcatgocatgo";
        assertEquals(true, p.solve(ex1, "aabab"));
        assertEquals(true, p.solve(ex1, "a"));
        assertEquals(true, p.solve(ex1, "ab"));
        assertEquals(true, p.solve(ex1, "abb"));
        assertEquals(false, p.solve(ex1, "aaa"));
        assertEquals(false, p.solve(ex1, "bb"));
        assertEquals(false, p.solve(ex1, "baba"));
    }
}
