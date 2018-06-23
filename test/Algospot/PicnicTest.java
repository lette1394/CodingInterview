package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PicnicTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() {
        String input =
                "3 \n" +
                "2 1 \n" +
                "0 1 \n" +
                "4 6 \n" +
                "0 1 1 2 2 3 3 0 0 2 1 3 \n" +
                "6 10 \n" +
                "0 1 0 2 1 2 1 3 1 4 2 3 2 4 3 4 3 5 4 5 \n";

        String expected =
                "1\n" +
                "3\n" +
                "4\n";

        simulate(input);
        Picnic.main(null);

        assertEquals(expected, out.toString());

    }

}
