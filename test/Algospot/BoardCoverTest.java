package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BoardCoverTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() {
        String input =
                "3 \n" +
                "3 7 \n" +
                "#.....# \n" +
                "#.....# \n" +
                "##...## \n" +
                "3 7 \n" +
                "#.....# \n" +
                "#.....# \n" +
                "##..### \n" +
                "8 10 \n" +
                "########## \n" +
                "#........# \n" +
                "#........# \n" +
                "#........# \n" +
                "#........# \n" +
                "#........# \n" +
                "#........# \n" +
                "########## \n";

        String expected =
                "0\n" +
                "2\n" +
                "1514\n";

        simulate(input);
        BoardCover.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() {
        String input =
                "1 \n" +
                "3 7 \n" +
                "####### \n" +
                "####### \n" +
                "####### \n";

        String expected =
                "0\n";

        simulate(input);
        BoardCover.main(null);

        assertEquals(expected, out.toString());
    }
}
