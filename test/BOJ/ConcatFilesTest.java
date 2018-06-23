package BOJ;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConcatFilesTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "2\n" +
                "4\n" +
                "40 30 30 50\n" +
                "15\n" +
                "1 21 3 4 5 35 5 4 3 5 98 21 14 17 32";

        String expected = "300\n" +
                "864\n";

        simulate(input);
        ConcatFiles.main(null);

        assertEquals(expected, out.toString());
    }
}
