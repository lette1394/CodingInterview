package Programmers;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HaniumTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final void simulate(String input) {
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
    }
}
