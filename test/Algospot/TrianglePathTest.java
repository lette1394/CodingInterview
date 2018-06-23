package Algospot;

import org.junit.Test;

import java.io.*;

import static junit.framework.TestCase.assertEquals;

public class TrianglePathTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input =
                "2\n" +
                "5\n" +
                "6\n" +
                "1  2\n" +
                "3  7  4\n" +
                "9  4  1  7\n" +
                "2  7  5  9  4\n" +
                "5\n" +
                "1 \n" +
                "2 4\n" +
                "8 16 8\n" +
                "32 64 32 64\n" +
                "128 256 128 256 128\n";

        String expected =
                "28\n" +
                "341\n";

        simulate(input);
        TrianglePath.main(null);

        assertEquals(expected, out.toString());
    }
}
