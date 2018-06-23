package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class JumpGameTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input =
                "2\n" +
                "7\n" +
                "2 5 1 6 1 4 1\n" +
                "6 1 1 2 2 9 3\n" +
                "7 2 3 2 1 3 1\n" +
                "1 1 3 1 7 1 2\n" +
                "4 1 2 3 4 1 2\n" +
                "3 3 1 2 3 4 1\n" +
                "1 5 2 9 4 7 0\n" +
                "7\n" +
                "2 5 1 6 1 4 1\n" +
                "6 1 1 2 2 9 3\n" +
                "7 2 3 2 1 3 1\n" +
                "1 1 3 1 7 1 2\n" +
                "4 1 2 3 4 1 3\n" +
                "3 3 1 2 3 4 1\n" +
                "1 5 2 9 4 7 0\n";

        String expected =
                "YES\n" +
                "NO\n";

        simulate(input);
        JumpGame.main(null);

        assertEquals(expected, out.toString());

    }
}
