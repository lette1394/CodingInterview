package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SherlockAndArrayTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() {
        String input = "2\n" +
                "3\n" +
                "1 2 3\n" +
                "4\n" +
                "1 2 3 3\n";

        String expected = "NO\n" +
                "YES\n";

        simulate(input);
        SherlockAndArray.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() {
        String input = "2\n" +
                "1\n" +
                "1\n" +
                "3\n" +
                "1 999 1\n";

        String expected = "YES\n" +
                "YES\n";

        simulate(input);
        SherlockAndArray.main(null);

        assertEquals(expected, out.toString());
    }
}
