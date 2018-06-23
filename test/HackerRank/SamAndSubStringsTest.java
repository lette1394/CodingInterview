package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class SamAndSubStringsTest {
    public void simulate(String input) throws Exception {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        String input = "16";
        simulate(input);

        assertEquals(23, SamAndSubStrings.run());
    }

    @Test
    public void main2() throws Exception {
        String input = "123";
        simulate(input);

        assertEquals(164, SamAndSubStrings.run());
    }

    @Test
    public void main4() throws Exception {
        String input = "6789";
        simulate(input);

        assertEquals(8520, SamAndSubStrings.run());
    }

    @Test
    public void main3() throws Exception {
        String input = "535536123162335174374523598123538921235873251789132553123125";
        simulate(input);

        assertEquals(996495999, SamAndSubStrings.run());
    }
}
