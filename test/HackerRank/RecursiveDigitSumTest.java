package HackerRank;

import org.junit.Test;

import java.io.*;
import java.util.*;
import static org.junit.Assert.*;

public class RecursiveDigitSumTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "148 3\n";

        simulate(input);
        RecursiveDigitSum.main(null);
        assertEquals("3\n", out.toString());
    }
}
