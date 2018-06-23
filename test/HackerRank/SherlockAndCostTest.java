package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SherlockAndCostTest {
    public List<Integer> simulate(String input) throws Exception {

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        return SherlockAndCost.run(null);
    }

    @Test
    public void main() throws Exception {
        String input = "1\n" +
                "5\n" +
                "10 1 10 1 10";
        List<Integer> list = simulate(input);

        assertEquals(Arrays.asList(36), list);
    }

    @Test
    public void main2() throws Exception {
        String input = "1\n" +
                "1\n" +
                "10";
        List<Integer> list = simulate(input);

        assertEquals(Arrays.asList(10), list);
    }

    @Test
    public void main3() throws Exception {
        String input = "1\n" +
                "5\n" +
                "100 2 100 2 100";
        List<Integer> list = simulate(input);

        assertEquals(Arrays.asList(396), list);
    }
}
