package Chap1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NoDupTest {
    private NoDup dup = new NoDup();

    @Before
    public void SetUp() {
        this.dup = new NoDup();
    }

    @Test
    public void Blank() {
        assertEquals(false, dup.isDuplicated(""));
    }

    @Test
    public void SingleFalse() {
        assertEquals(false, dup.isDuplicated("a"));
        assertEquals(false, dup.isDuplicated("b"));
        assertEquals(false, dup.isDuplicated("5"));
    }

    @Test
    public void MoreFalse() {
        assertEquals(false, dup.isDuplicated("a1k6"));
        assertEquals(false, dup.isDuplicated("abc"));
        assertEquals(false, dup.isDuplicated("poiuytrewqasdfghjkl"));

    }

    @Test
    public void MoreTrue() {
        assertEquals(true, dup.isDuplicated("aa"));
        assertEquals(true, dup.isDuplicated("aaa"));
        assertEquals(true, dup.isDuplicated("abcaa"));
        assertEquals(true, dup.isDuplicated("bcddc"));
        assertEquals(true, dup.isDuplicated("bbcffc"));
        assertEquals(true, dup.isDuplicated("bcfggj"));
    }
}
