package BOJ;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RGBStreetTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "26 40 83\n" +
                "49 60 57\n" +
                "13 89 99";

        String expected = "96\n";

        simulate(input);
        RGBStreet.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "5\n" +
                "26 40 83\n" +
                "49 60 57\n" +
                "13 89 99\n" +
                "44 55 66\n" +
                "1 2 3";

        String expected = "152\n";

        simulate(input);
        RGBStreet.main(null);

        assertEquals(expected, out.toString());
    }
}
