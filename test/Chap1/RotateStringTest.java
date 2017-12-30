package Chap1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RotateStringTest {
    RotateString rs;

    @Before
    public void setUp() {
        rs = new RotateString();
    }

    @Test
    public void blank() {
        assertEquals(true, rs.isSubstring("", ""));

        assertEquals(false, rs.isSubstring("a", ""));
        assertEquals(false, rs.isSubstring("", "a"));
    }

    @Test
    public void one() {
        assertEquals(true, rs.isSubstring("a", "a"));
        assertEquals(true, rs.isSubstring("b", "b"));

        assertEquals(false, rs.isSubstring("a", "b"));
        assertEquals(false, rs.isSubstring("b", "a"));
    }

    @Test
    public void more() {
        assertEquals(true, rs.isSubstring("ab", "ba"));
        assertEquals(true, rs.isSubstring("wow", "wow"));
        assertEquals(true, rs.isSubstring("wow", "oww"));
        assertEquals(true, rs.isSubstring("wow", "wwo"));

        assertEquals(true, rs.isSubstring("IDEandPLUGIN", "DEandPLUGINI"));
        assertEquals(true, rs.isSubstring("IDEandPLUGIN", "ndPLUGINIDEa"));
        assertEquals(true, rs.isSubstring("IDEandPLUGIN", "GINIDEandPLU"));
        assertEquals(true, rs.isSubstring("IDEandPLUGIN", "NIDEandPLUGI"));

        assertEquals(false, rs.isSubstring("ab", "abc"));
        assertEquals(false, rs.isSubstring("wow", "wo"));
        assertEquals(false, rs.isSubstring("IDEandPLUGIN", "ndPLUGINIDE"));
        assertEquals(false, rs.isSubstring("IDEandPLUGIN", "ndPLUGINIDE"));

        assertEquals(false, rs.isSubstring("IDEandPLUGIN", "NIDEaodPLuGI"));

    }

    @Test
    public void test() {
        assertEquals(true, rs.isSubstring("waterbottle", "erbottlewat"));
    }
}
