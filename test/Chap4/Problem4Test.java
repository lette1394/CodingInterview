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

    @Before
    public void before() {
        p4 = new Problem4();
    }

    @Test
    public void parseSTDIN() throws IOException {
        String line1 = "a b c d e f\n";
        String line2 = "a d\nf b\nb d\nf a\nd c\n";
        String inputData = line1 + line2;

        InputStream in = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(in);

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
    public void getOrder() {
        String line1 = "a b c d e f\n";
        String line2 = "a d\nf b\nb d\nf a\nd c\n";
        String inputData = line1 + line2;

        InputStream in = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(in);

        assertEquals("e f a b d c", p4.getOrder());
    }
}
