package Algospot;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class BoggleTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() {
        String input =
                "1\n" +
                "URLPM\n" +
                "XPRET\n" +
                "GIAET\n" +
                "XTNZY\n" +
                "XOQRS\n" +
                "6\n" +
                "PRETTY\n" +
                "GIRL\n" +
                "REPEAT\n" +
                "KARA\n" +
                "PANDORA\n" +
                "GIAZAPX";

        String expected =
                "PRETTY YES\n" +
                "GIRL YES\n" +
                "REPEAT YES\n" +
                "KARA NO\n" +
                "PANDORA NO\n" +
                "GIAZAPX YES\n";

        simulate(input);
        Boggle.main(null);

        assertEquals(expected, out.toString());
    }

}
