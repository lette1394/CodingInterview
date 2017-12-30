package Chap1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

//1.4 문제
public class RefactorSpaceTest {
    RefactorSpace rf = new RefactorSpace();

    @Test
    public void backBlank() {
        assertEquals("", rf.refactor("", 0));
        assertEquals("", rf.refactor(" ", 1));
        assertEquals("%20", rf.refactor("%20", 3));
        assertEquals("abc", rf.refactor("abc", 3));
        assertEquals("te%20st", rf.refactor("te%20st", 7));
        assertEquals("Mr%20John%20Smith", rf.refactor("Mr John Smith", 13));
        assertEquals("Mr%20John%20Smith", rf.refactor("Mr John Smith   ", 16));
        assertEquals("%20Mr%20John%20Smith", rf.refactor("%20Mr John Smith   ", 19));
    }

    @Test
    public void frontBlank() {
        assertEquals("Mr%20John%20Smith", rf.refactor(" Mr John Smith", 14));
        assertEquals("Mr%20John%20Smith", rf.refactor("   Mr John Smith", 16));

    }
}
