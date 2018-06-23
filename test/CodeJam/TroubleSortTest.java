package CodeJam;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class TroubleSortTest {
    final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        String input = "2\n" +
                "5\n" +
                "5 6 8 4 3\n" +
                "3\n" +
                "8 9 7\n";

        String expected = "Case #1: OK\n" +
                "Case #2: 1\n";

        simulate(input);
        TroubleSort.main(null);

        assertEquals(expected, out.toString());
    }
}

/*
     TroubleSort(L): // L is a 0-indexed list of integers
    let done := false
    while not done:
      done = true
      for i := 0; i < len(L)-2; i++:
        if L[i] > L[i+2]:
          done = false
          reverse the sublist from L[i] to L[i+2], inclusive
     */


