package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class GradingStudentsTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }


    @Test
    public void main() throws Exception {
        String input = "4\n" +
                "73\n" +
                "67\n" +
                "38\n" +
                "33\n";
        String expected = "75\n" +
                "67\n" +
                "40\n" +
                "33\n";

        simulate(input);
        GradingStudents.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "2\n" +
                "37\n" +
                "38\n";

        String expected = "37\n" +
                "40\n";

        simulate(input);
        GradingStudents.main(null);

        assertEquals(expected, out.toString());
    }
}
