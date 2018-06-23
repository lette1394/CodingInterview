package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class ThePowerSumTest {
    void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        simulate("10\n 2\n");

        assertEquals(1, ThePowerSum.run());
    }

    @Test
    public void main2() throws Exception {
        simulate("100\n 2\n");

        assertEquals(3, ThePowerSum.run());
    }

    @Test
    public void main3() throws Exception {
        simulate("100\n 3\n");

        assertEquals(1, ThePowerSum.run());
    }
}

