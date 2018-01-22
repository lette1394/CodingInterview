package Chap4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem4BalanceTest {
    Problem4Balance p = new Problem4Balance();
    Problem3Test pt = new Problem3Test();

    @Test
    public void tests() {
        Node node = pt.getExampleTree();

        assertEquals(true, p.solve(node));
    }



}
