package Chap10;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

public class Problem5Test {
    Problem5 p5;

    @Before
    public void before() {
        this.p5 = new Problem5();
    }

    @Test
    public void main() {
        String[] str = new String[] {
                "at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""
        };
        assertEquals(4, p5.sparseSearch("ball", str));
    }

    @Test
    public void boundary() {
        String[] str1 = new String[] {
                "at"
        };
        assertEquals(0, p5.sparseSearch("at", str1));

        String[] str2 = new String[] {
                "two"
        };
        assertEquals(0, p5.sparseSearch("two", str2));

        String[] blank = new String[] {
                ""
        };
        assertEquals(0, p5.sparseSearch("", blank));
    }

    @Test
    public void two() {
        String[] str1 = new String[] {
                "at", "", "kk"
        };
        assertEquals(2, p5.sparseSearch("kk", str1));

        String[] str2 = new String[] {
                "", "", "", "zero"
        };
        assertEquals(3, p5.sparseSearch("zero", str2));
    }

    @Test
    public void length() {
        String[] str1 = new String[] {
                "at", "", "kk", "", "kkk", "", "", "", "kkkk", "", "kkkkk", "", "", "kkkkkkk", "", "kkkkkkkkk", ""
        };
        assertEquals(8, p5.sparseSearch("kkkk", str1));
        assertEquals(10, p5.sparseSearch("kkkkk", str1));
        assertEquals(13, p5.sparseSearch("kkkkkkk", str1));
    }

    @Test
    public void order() {
        String[] str1 = new String[] {
                "", "", "aaabb", "", "aaabc", "", "", "", "aabbc", "", "aabce", "", "", "aaccc", "", "abcd", "", "", "", ""
        };
        assertEquals(4, p5.sparseSearch("aaabc", str1));
        assertEquals(8, p5.sparseSearch("aabbc", str1));
        assertEquals(15, p5.sparseSearch("abcd", str1));
    }



}
