package HackerRank;

import org.junit.Test;

import static org.junit.Assert.*;
import java.io.*;

public class ConstructTheArrayTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "4\n3\n2\n";
        String expected = "3\n";

        simulate(input);
        ConstructTheArray.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "3\n3\n3\n";
        String expected = "1\n";

        simulate(input);
        ConstructTheArray.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "10000\n10000\n1000\n";
        String expected = "259150193\n";

        simulate(input);
        ConstructTheArray.main(null);

        assertEquals(expected, out.toString());
    }
}
