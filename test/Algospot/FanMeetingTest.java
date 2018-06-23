package Algospot;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class FanMeetingTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        String input = "4\n" +
                "FFFMMM\n" +
                "MMMFFF\n" +
                "FFFFF\n" +
                "FFFFFFFFFF\n" +
                "FFFFM\n" +
                "FFFFFMMMMF\n" +
                "MFMFMFFFMMMFMF\n" +
                "MMFFFFFMFFFMFFFFFFMFFFMFFFFMFMMFFFFFFF\n";

        String expeceted = "1\n" +
                "6\n" +
                "2\n" +
                "2\n";

        simulate(input);
        FanMeeting.main(null);

        assertEquals(expeceted, out.toString());
    }
}
