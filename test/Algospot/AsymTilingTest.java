package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AsymTilingTest {
    final private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "2\n" +
                "4\n" +
                "92\n";

        String expected = "0\n" +
                "2\n" +
                "913227494\n";

        simulate(input);
        AsymTiling.main(null);

        assertEquals(expected, out.toString());
    }
}
