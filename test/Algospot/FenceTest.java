package Algospot;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class FenceTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input =
                "3 \n" +
                "7\n" +
                "7 1 5 9 6 7 3\n" +
                "7\n" +
                "1 4 4 4 4 1 1\n" +
                "4\n" +
                "1 8 2 2\n";

        String expected =
                "20\n" +
                "16\n" +
                "8\n";

        simulate(input);
        Fence.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main1() throws Exception {
        String input =
                "2\n" +
                "2 \n" +
                "10 8 \n" +
                "8 \n" +
                "5 6 7 8 9 1 2 3  \n";

        String expected =
                "16\n" +
                "25\n";

        simulate(input);
        Fence.main(null);

        assertEquals(expected, out.toString());
    }
}
