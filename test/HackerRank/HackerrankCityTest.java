package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HackerrankCityTest {
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "1\n" +
                "1\n";

        String expected = "29\n";

        simulate(input);
        HackerrankCity.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "2\n" +
                "2 1\n";

        String expected = "2641\n";

        simulate(input);
        HackerrankCity.main(null);

        assertEquals(expected, out.toString());
    }
}
