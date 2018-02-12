package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ArraylistPTest {
    void simulateSTDIN() {
        String input = "5\n" +
                "5 41 77 74 22 44\n" +
                "1 12\n" +
                "4 37 34 36 52\n" +
                "0\n" +
                "3 20 22 33\n" +
                "5\n" +
                "1 3\n" +
                "3 4\n" +
                "3 1\n" +
                "4 3\n" +
                "5 5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void name() throws Exception {
        simulateSTDIN();
        ArraylistP.parse();
        ArraylistP.printElements();
    }
}
