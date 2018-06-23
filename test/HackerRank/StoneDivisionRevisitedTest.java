package HackerRank;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

public class StoneDivisionRevisitedTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    public void simulate(String input) throws Exception {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "1\n" +
                "12 3\n" +
                "2 3 4";

        String expected = "4\n";

        simulate(input);
        StoneDivisionRevisited.main(null);

        assertEquals(expected, out.toString());
    }
}
