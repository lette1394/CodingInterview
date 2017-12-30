package Programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExerciseTest {
    StringExercise se;

    @Before
    public void setUp() {
        se = new StringExercise();
    }
    @Test
    public void getMiddle() throws Exception {
        assertEquals("", se.getMiddle(""));
        assertEquals("z", se.getMiddle("z"));
        assertEquals("ab", se.getMiddle("ab"));
        assertEquals("w", se.getMiddle("power"));
        assertEquals("es", se.getMiddle("test"));
        assertEquals("es", se.getMiddle("test"));
    }

}