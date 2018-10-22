package Practice;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MyBinarySearchTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main1() throws Exception {
        String input = "10 20 40 25 20 50 30 70 85";
        String expected = "10 20 25 30 70 85 ";

        simulate(input);

        MyBinarySearch.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "4 1 3 7 5";
        String expected = "1 3 5 ";

        simulate(input);

        MyBinarySearch.main(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15";
        String expected = "0 2 6 9 11 15 ";

        simulate(input);

        MyBinarySearch.main(null);

        assertEquals(expected, out.toString());
    }
}
