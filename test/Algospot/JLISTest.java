package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class JLISTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3 \n" +
                "3 3 \n" +
                "1 2 4\n" +
                "3 4 7  \n" +
                "3 3\n" +
                "1 2 3\n" +
                "4 5 6\n" +
                "5 3\n" +
                "10 20 30 1 2\n" +
                "10 20 30\n";

        String expected = "5\n" +
                "6\n" +
                "5\n";


        simulate(input);
        JLIS.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main1() throws Exception {
        String input = "3 \n" +
                "3 3 \n" +
                "1   2 4\n" +
                "3  4 7  \n" +
                "3 3\n" +
                "1 2 3\n" +
                "4 5 6\n" +
                "5 5\n" +
                "3 4 5 7 2\n" +
                "6 4 8 9 1\n";

        String expected = "5\n" +
                "6\n" +
                "7\n";


        simulate(input);
        JLIS.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "1\n" +
                "2 3\n" +
                "-2147483648 -2147483648\n" +
                "-2147483648 -2147483648 -2147483648\n";

        String expected = "1\n";


        simulate(input);
        JLIS.main(null);

        assertEquals(expected, out.toString());
    }
}
