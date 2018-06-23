package CodeChef;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MinimumDeletionsTest {
    private ByteArrayOutputStream out = new ByteArrayOutputStream();


    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "4\n" +
                "2\n" +
                "2 3\n" +
                "2\n" +
                "2 4\n" +
                "3\n" +
                "1 2 3\n" +
                "6\n" +
                "2 3 4 5 6 7\n";

        String expected = "0\n" +
                "-1\n" +
                "0\n" +
                "2\n";

        simulate(input);

        MinimumDeletions.main(null);
        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "4\n" +
                "2\n" +
                "1 1\n" +
                "2\n" +
                "1 2\n" +
                "2\n" +
                "2 1\n" +
                "2\n" +
                "2 2\n";

        String expected = "0\n" +
                "0\n" +
                "0\n" +
                "-1\n";

        simulate(input);

        MinimumDeletions.main(null);
        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "8\n" +
                "3\n" +
                "1 2 3\n" +
                "3\n" +
                "3 2 1\n" +
                "3\n" +
                "2 2 2\n" +
                "3\n" +
                "2 3 2\n" +
                "3\n" +
                "2 4 6\n" +
                "3\n" +
                "1 3 9\n" +
                "3\n" +
                "1 1 1\n" +
                "3\n" +
                "2 1 44\n";

        String expected = "0\n" +
                "0\n" +
                "-1\n" +
                "1\n" +
                "-1\n" +
                "1\n" +
                "0\n" +
                "1\n";

        simulate(input);

        MinimumDeletions.main(null);
        assertEquals(expected, out.toString());
    }

    @Test
    public void main4() throws Exception {
        String input = "8\n" +
                "3\n" +
                "3 30 300\n" +
                "3\n" +
                "1 10 100\n" +
                "3\n" +
                "1 11 111\n" +
                "3\n" +
                "20 52 124\n" +
                "3\n" +
                "11 12 13\n" +
                "3\n" +
                "13 17 7\n" +
                "3\n" +
                "8 82 44\n" +
                "3\n" +
                "40 52 11\n";

        String expected = "-1\n" +
                "1\n" +
                "0\n" +
                "-1\n" +
                "0\n" +
                "0\n" +
                "-1\n" +
                "1\n";

        simulate(input);

        MinimumDeletions.main(null);
        assertEquals(expected, out.toString());
    }
}
