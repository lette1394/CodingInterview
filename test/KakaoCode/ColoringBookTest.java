package KakaoCode;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ColoringBookTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() {
        String input = "2 4\n " +
                "1 1 1 0\n" +
                "1 0 1 1\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[1, 6]\n", out.toString());
    }

    @Test
    public void main2() {
        String input = "3 4\n " +
                "1 1 1 0\n" +
                "1 0 1 1\n" +
                "1 0 1 1\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[1, 9]\n", out.toString());
    }

    @Test
    public void main3() {
        String input = "2 4\n " +
                "1 1 0 0\n" +
                "1 0 1 1\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[2, 3]\n", out.toString());
    }

    @Test
    public void main4() {
        String input = "2 3\n " +
                "5 5 5\n" +
                "1 1 0\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[2, 3]\n", out.toString());
    }

    @Test
    public void main5() {
        String input = "2 3\n " +
                "5 7 5\n" +
                "1 1 0\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[4, 2]\n", out.toString());
    }

    @Test
    public void main6() {
        String input = "6 7\n " +
                "5 7 5 1 1 1 1\n" +
                "5 7 5 1 1 1 1\n" +
                "0 0 0 0 0 0 0\n" +
                "5 7 5 1 1 1 1\n" +
                "5 7 5 1 1 1 1\n" +
                "5 7 5 1 1 1 1\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[8, 12]\n", out.toString());
    }

    @Test
    public void main7() {
        String input = "2 3\n " +
                "0 0 0\n" +
                "0 0 0\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[0, 0]\n", out.toString());
    }

    @Test
    public void main8() {
        String input = "2 3\n " +
                "1 2 3\n" +
                "6 5 4\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[6, 1]\n", out.toString());
    }

    @Test
    public void main9() {
        String input = "1 1\n " +
                "1\n";

        simulate(input);
        ColoringBook.main(null);

        assertEquals("[1, 1]\n", out.toString());
    }

}
