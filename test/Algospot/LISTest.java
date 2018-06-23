package Algospot;

import org.junit.Test;

import java.io.*;

import static junit.framework.TestCase.assertEquals;

public class LISTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        String input =
                "3\n" +
                "4\n" +
                "1 2 3 4\n" +
                "8\n" +
                "5 4 3 2 1 6 7 8 \n" +
                "8\n" +
                "5 6 7 8 1 2 3 4\n";

        String expected =
                "4\n" +
                "4\n" +
                "4\n";

        simulate(input);
        LIS.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "3\n" +
                        "1\n" +
                        "1\n" +
                        "13\n" +
                        "5 6 7 8 1 9 100 2 1 2 6 3 4\n" +
                "5\n" +
                "100 9 8 7 1";

        String expected = "1\n" +
                        "6\n" +
                "1\n";

        simulate(input);
        LIS.main(null);

        assertEquals(expected, out.toString());
    }
}
