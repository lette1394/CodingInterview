package HackerRank;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class TheMaximumSubarrayTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "2\n" +
                "4\n" +
                "1 2 3 4\n" +
                "6\n" +
                "2 -1 2 3 4 -5";

        String expected = "10 10\n" +
                "10 11\n";

        simulate(input);
        TheMaximumSubarray.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "2\n" +
                "4\n" +
                "-1 -2 3 -4\n" +
                "6\n" +
                "-2 -1 -2 -3 -4 -5";

        String expected = "3 3\n" +
                "-1 -1\n";

        simulate(input);
        TheMaximumSubarray.main(null);

        assertEquals(expected, out.toString());
    }
}
