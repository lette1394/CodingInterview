package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class ArithmeticExpressionsTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "22 79 21\n";

        String expected = "22*79-21\n";

        simulate(input);
        ArithmeticExpressions.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "5\n" +
                "55 3 45 33 25\n";

        String expected = "55+3-45*33-25\n";

        simulate(input);
        ArithmeticExpressions.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "2\n" +
                "22 79\n";

        String expected = "22+79\n";

        simulate(input);
        ArithmeticExpressions.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void empty() throws Exception {
        String input = "0\n" +
                "";

        String expected = "";

        simulate(input);
        ArithmeticExpressions.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void fail() throws Exception {
        String input = "51\n" +
                "51 1 1 1 1 1 100 100 1 100 1 100 1 100 1 1 1 100 1 100 100 1 1 100 100 1 100 100 100 1 1 1 1 100 1 1 100 100 1 1 1 100 100 100 100 100 100 100 1 1 1";

        String expected = "51+1+1+1+1+1-100-100+1-100+1-100+1-100+1+1+1-100+1-100-100+1+1-100-100+1-100-100-100+1+1+1+1-100+1+1-100-100+1+1+1-100-100-100-100-100-100-100+1+1+1";

        simulate(input);
        ArithmeticExpressions.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void fail2() throws Exception {
        String input = "37\n" +
                "15 50 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1";

        String expected = "15-50+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1";

        simulate(input);
        ArithmeticExpressions.main(null);

        assertEquals(expected, out.toString());
    }
}
