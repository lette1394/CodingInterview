package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class QuantizeTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "4\n" +
                "10 3\n" +
                "3 3 3 1 2 3 2 2 2 1\n" +
                "9 3\n" +
                "1 744 755 4 897 902 890 6 777\n" +
                "10 8\n" +
                "1 2 3 4 5 6 7 8 9 10\n" +
                "5 3\n" +
                "1 1 1 1 1\n";


        String expected = "0\n" +
                "651\n" +
                "2\n" +
                "0\n";

        simulate(input);
        Quantize.main(null);

        assertEquals(expected, out.toString());
    }
}
