package Programmers;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tiling3Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main1() {
        final int input = 4;
        final int expected = 11;

        final int actual = Tiling3.solution(input);

        assertEquals(expected, actual);
    }
}
