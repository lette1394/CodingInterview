package Algospot;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class ClockSyncTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test(timeout = 10000)
    public void main() throws Exception {
        String input =
                "2\n" +
                "12 6 6 6 6 6 12 12 12 12 12 12 12 12 12 12\n" +
                "12 9 3 12 6 6 9 3 12 9 12 9 12 12 6 6\n";

        String expected =
                "2\n" +
                "9\n";

        simulate(input);
        ClockSync.main(null);

        assertEquals(expected, out.toString());
    }
}
