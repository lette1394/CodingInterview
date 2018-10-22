package LINE;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class OneTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "1 2 3 9 8";

        String expected = "0\n" +
                "2\n" +
                "1514\n";

        simulate(input);
        One.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "We test coders. Give us a try?";
        String input2 = "Forget  CVs..Save time . x x";
        int ret = One.solution(input);

        assertEquals(One.solution(input2), 2);
        assertEquals(ret, 4);
    }
}
