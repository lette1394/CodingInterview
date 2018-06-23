package Algospot;

import org.junit.Test;

import java.util.*;
import java.io.*;

import static org.junit.Assert.assertEquals;

public class QuadTreeTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input =
                "4\n" +
                "w\n" +
                "xbwwb\n" +
                "xbwxwbbwb\n" +
                "xxwwwbxwxwbbbwwxxxwwbbbwwwwbb\n";

        String expected =
                "w\n" +
                "xwbbw\n" +
                "xxbwwbbbw\n" +
                "xxwbxwwxbbwwbwbxwbwwxwwwxbbwb\n";

        simulate(input);
        QuadTree.main(null);

        assertEquals(expected, out.toString());
    }
}
