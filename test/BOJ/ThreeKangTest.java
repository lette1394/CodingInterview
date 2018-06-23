package BOJ;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ThreeKangTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    public void simulate(String input) throws Exception {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3 5 9\n";
        simulate(input);

        ThreeKang.main(null);
        assertEquals("3\n", out.toString());
    }
}
