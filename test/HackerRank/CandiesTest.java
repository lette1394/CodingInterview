package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;


public class CandiesTest {
    public long simulate(String input) throws Exception {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        return Candies.run();
    }

    @Test
    public void increase() throws Exception {
        String input = "5\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n";

        assertEquals(15, simulate(input));
    }

    @Test
    public void decrease() throws Exception {
        String input = "5\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n";

        assertEquals(15, simulate(input));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "1\n" +
                "2\n" +
                "2";

        assertEquals(4, simulate(input));
    }

    @Test
    public void main2() throws Exception {
        String input = "10\n" +
                "2\n" +
                "4\n" +
                "2\n" +
                "6\n" +
                "1\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "2\n" +
                "1";

        assertEquals(19, simulate(input));
    }

    @Test
    public void main3() throws Exception {
        String input = "5\n" +
                "2\n" +
                "1\n" +
                "3\n" +
                "4\n" +
                "5\n";

        assertEquals(12, simulate(input));
    }

    @Test
    public void main4() throws Exception {
        String input = "6\n" +
                "5\n" +
                "2\n" +
                "1\n" +
                "7\n" +
                "6\n" +
                "5\n";

        assertEquals(12, simulate(input));
    }

    @Test
    public void main5() throws Exception {
        String input = "6\n" +
                "25\n" +
                "25\n" +
                "25\n" +
                "25\n" +
                "25\n" +
                "25\n";

        assertEquals(6, simulate(input));
    }
}
