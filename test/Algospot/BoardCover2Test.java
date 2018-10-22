package Algospot;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class BoardCover2Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "3 7\n" +
                "#.....#\n" +
                "#.....#\n" +
                "##...##\n" +
                "3 7\n" +
                "#.....#\n" +
                "#.....#\n" +
                "##..###\n" +
                "8 10\n" +
                "##########\n" +
                "#........#\n" +
                "#........#\n" +
                "#........#\n" +
                "#........#\n" +
                "#........#\n" +
                "#........#\n" +
                "##########\n";

        String expected = "0\n" +
                "2\n" +
                "1514\n";

        simulate(input);
        BoardCover2.main(null);

        assertEquals(expected, out.toString());
    }
}
