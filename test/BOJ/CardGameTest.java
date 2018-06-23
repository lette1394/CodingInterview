package BOJ;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CardGameTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "4\n" +
                "1 2 5 2\n" +
                "9\n" +
                "1 1 1 1 2 2 2 2 2\n" +
                "4\n" +
                "4 3 1 2\n";

        String expected = "6\n" +
                "8\n" +
                "";

        simulate(input);

        CardGame.main(null);

        assertEquals(expected, out.toString());
    }
}
