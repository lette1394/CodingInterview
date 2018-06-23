package BOJ;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DrinkGrapeTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "6\n" +
                "6\n" +
                "10\n" +
                "13\n" +
                "9\n" +
                "8\n" +
                "1";

        simulate(input);
        DrinkGrape.main(null);

        assertEquals("33\n", out.toString());
    }

    @Test
    public void mainExtend1() throws Exception {
        String input = "10\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "6\n" +
                "10\n" +
                "13\n" +
                "9\n" +
                "8\n" +
                "1";

        simulate(input);
        DrinkGrape.main(null);

        assertEquals("40\n", out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "6\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6";

        simulate(input);
        DrinkGrape.main(null);

        assertEquals("16\n", out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "10\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n";

        simulate(input);
        DrinkGrape.main(null);

        assertEquals("40\n", out.toString());
    }

    @Test
    public void main4() throws Exception {
        String input = "6\n" +
                "100\n" +
                "400\n" +
                "2\n" +
                "1\n" +
                "4\n" +
                "200\n";

        simulate(input);
        DrinkGrape.main(null);

        assertEquals("704\n", out.toString());
    }

}
