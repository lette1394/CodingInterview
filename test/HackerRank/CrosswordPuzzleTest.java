package HackerRank;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static HackerRank.CrosswordPuzzle.*;
import static org.junit.Assert.assertEquals;

public class CrosswordPuzzleTest {
    void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void main() throws Exception {
        String input =
                "+-++++++++\n" +
                "+-++++++++\n" +
                "+-++++++++\n" +
                "+-----++++\n" +
                "+-+++-++++\n" +
                "+-+++-++++\n" +
                "+++++-++++\n" +
                "++------++\n" +
                "+++++-++++\n" +
                "+++++-++++\n" +
                "LONDON;DELHI;ICELAND;ANKARA";

        String expected =
                "+L++++++++\n" +
                "+O++++++++\n" +
                "+N++++++++\n" +
                "+DELHI++++\n" +
                "+O+++C++++\n" +
                "+N+++E++++\n" +
                "+++++L++++\n" +
                "++ANKARA++\n" +
                "+++++N++++\n" +
                "+++++D++++";

        simulate(input);
//        assertEquals(expected, print(solve()));
    }

    @Test
    public void main2() throws Exception {
        String input = "+-++++++++\n" +
                "+-++++++++\n" +
                "+-------++\n" +
                "+-++++++++\n" +
                "+-++++++++\n" +
                "+------+++\n" +
                "+-+++-++++\n" +
                "+++++-++++\n" +
                "+++++-++++\n" +
                "++++++++++\n" +
                "AGRA;NORWAY;ENGLAND;GWALIOR";

        String expected = "+E++++++++\n" +
                "+N++++++++\n" +
                "+GWALIOR++\n" +
                "+L++++++++\n" +
                "+A++++++++\n" +
                "+NORWAY+++\n" +
                "+D+++G++++\n" +
                "+++++R++++\n" +
                "+++++A++++\n" +
                "++++++++++";

        simulate(input);
//        assertEquals(expected, print(run()));
    }
}
