package Practice;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MyRegexTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main1() throws Exception {
        String input = "hello world! im your energy";
        String expected = "hello_world!_im_your_energy\n";

        simulate(input);
        MyRegex.test1(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "ftp://file_server.com:21/top_secret/life_changing_plans.pdf";
        String expected = "line1: ftp\n" +
                "line2: file_server.com\n" +
                "line3: 21\n" +
                "line4: life_changing_plans\n" +
                "line5: pdf\n";

        simulate(input);
        MyRegex.test2(null);

        assertEquals(expected, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "ftp://file_server.com:21/top_secret/life_changing_plans.pdf";
        String expected = "ftp://file_server.com:21\n" +
                "line1: ftp\n" +
                "line2: file_server.com\n" +
                "line3: 21\n";

        simulate(input);
        MyRegex.test3(null);

        assertEquals(expected, out.toString());
    }
}
