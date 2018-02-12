package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class SubArrayTest {

    @Test
    public void name() throws Exception {
        simulateSTDIN();
        SubArray.parse();
    }

    void simulateSTDIN() {
        String input = "5\n" +
                "1 -2 4 -5 1";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
}
