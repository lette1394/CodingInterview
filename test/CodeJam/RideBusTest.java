package CodeJam;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RideBusTest {
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "1 1\n" +
                "2\n" +
                "2 3\n" +
                "1 4\n" +
                "5 3\n" +
                "1 5 3 7 9\n";

        String expected = "Case #1\n" +
                "1\n" +
                "Case #2\n" +
                "2\n" +
                "Case #3\n" +
                "2\n";

        simulate(input);

        RideBus.main(null);
        assertEquals(expected, out.toString());
    }
}
