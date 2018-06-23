package CodeJam;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class STUATest {
    final private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "8\n" +
                "1 CS\n" +
                "2 CS\n" +
                "1 SS\n" +
                "6 SCCSSC\n" +
                "2 CC\n" +
                "3 CSCSS\n" +
                "0 CC\n" +
                "10 SSSS";

        String expected = "Case #1: 1\n" +
                "Case #2: 0\n" +
                "Case #3: IMPOSSIBLE\n" +
                "Case #4: 2\n" +
                "Case #5: 0\n" +
                "Case #6: 5\n" +
                "Case #7: 0\n" +
                "Case #8: 0\n";

        simulate(input);
        STUA.main(null);

        assertEquals(expected, out.toString());
    }
}
