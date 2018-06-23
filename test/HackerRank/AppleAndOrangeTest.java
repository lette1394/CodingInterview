package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AppleAndOrangeTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws IOException {
        String input = "7 11\n" +
                "5 15\n" +
                "3 2\n" +
                "-2 2 1\n" +
                "5 -6\n";

        String expected = "1\n" +
                "1\n";

        simulate(input);
        AppleAndOrange.main(null);

        assertEquals(expected, out.toString());
    }

}
