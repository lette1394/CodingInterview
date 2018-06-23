package BOJ;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SequenceAddTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "10\n" +
                "10 -4 3 1 5 6 -35 12 21 -1";

        String expected = "33\n";

        simulate(input);
        SequenceAdd.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "10\n" +
                "-2 -4 -3 -1 -5 -6 -35 -12 -21 -1";

        String expected = "-1\n";

        simulate(input);
        SequenceAdd.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "10\n" +
                "-2 -4 -3 -1 0 -6 -35 -12 -21 -1";

        String expected = "0\n";

        simulate(input);
        SequenceAdd.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main4() throws Exception {
        String input = "10\n" +
                "2 -4 -3 -1 5 -6 35 -12 0 -1";

        String expected = "-1\n";

        simulate(input);
        SequenceAdd.main(null);

        assertEquals(expected, out.toString());
    }
}
