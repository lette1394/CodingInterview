package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class WildcardTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input =
                "2\n" +
                "he?p\n" +
                "3\n" +
                "help\n" +
                "heap\n" +
                "helpp\n" +
                "*p*\n" +
                "3\n" +
                "help\n" +
                "papa\n" +
                "hello\n";

        String expected =
                "heap\n" +
                "help\n" +
                "help\n" +
                "papa\n";

        simulate(input);
        Wildcard.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void allStar() throws Exception {


    }
}
