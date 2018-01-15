package Chap4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Problem4Test {
    Problem4 p4;

    void simulateSTDIN(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Before
    public void before() {
        p4 = new Problem4();
    }

    @Test
    public void parseSTDIN() throws IOException {
        String line1 = "a b c d e f\n";
        String line2 = "a d\nf b\nb d\nf a\nd c\n";
        String inputData = line1 + line2;

        simulateSTDIN(inputData);
        p4.setGrid();

        assertArrayEquals(new int[][] {
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0}
        }, p4.grid);

    }

    @Test
    public void getOrder1() {
        String line1 = "a b c d e f\n";
        String line2 = "a d\nf b\nb d\nf a\nd c\n";
        String inputData = line1 + line2;

        simulateSTDIN(inputData);

        assertEquals("e f a b d c", p4.getOrder());
    }

    @Test
    public void boundary() {
        String line1 = "a\n";

        simulateSTDIN(line1);

        assertEquals("a", p4.getOrder());
    }

}
