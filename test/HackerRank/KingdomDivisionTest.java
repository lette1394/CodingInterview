package HackerRank;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class KingdomDivisionTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "5\n" +
                "1 2\n" +
                "1 3\n" +
                "3 4\n" +
                "3 5";

        simulate(input);
        KingdomDivision.main(null);

        assertEquals("4\n", out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "7\n" +
                "1 2\n" +
                "1 5\n" +
                "2 3\n" +
                "2 4\n" +
                "5 6\n" +
                "7 5";

        simulate(input);
        KingdomDivision.main(null);

        assertEquals("6\n", out.toString());
    }
}
