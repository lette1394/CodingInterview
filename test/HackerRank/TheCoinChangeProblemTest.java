package HackerRank;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheCoinChangeProblemTest {

    @Test
    public void main() throws Exception {
        long[] coins = new long[] {1, 2, 3};
        assertEquals(4, TheCoinChangeProblem.getWays(4, coins));
        assertEquals(4, TheCoinChangeProblem.getWays2(4, coins));
    }

    @Test
    public void main2() throws Exception {
        long[] coins = new long[] {2, 5, 3, 6};
        assertEquals(5, TheCoinChangeProblem.getWays(10, coins));
        assertEquals(5, TheCoinChangeProblem.getWays2(10, coins));
    }

    @Test(timeout = 2000)
    public void main3() throws Exception {
        long[] coins = new long[] {2, 5, 3, 6, 1, 4, 8, 9, 11, 77, 7};
        assertEquals(119804696, TheCoinChangeProblem.getWays(150, coins));
        assertEquals(119804696, TheCoinChangeProblem.getWays2(150, coins));
    }

    @Test
    public void main4() throws Exception {
        long[] coins = new long[] {2, 5, 3, 6, 1, 4, 8, 9, 11, 77, 7};
        assertEquals(
                TheCoinChangeProblem.getWays(20, coins),
                TheCoinChangeProblem.getWays2(20, coins));

        assertEquals(
                TheCoinChangeProblem.getWays(15, coins),
                TheCoinChangeProblem.getWays2(15, coins));

        assertEquals(
                TheCoinChangeProblem.getWays(38, coins),
                TheCoinChangeProblem.getWays2(38, coins));

        assertEquals(
                TheCoinChangeProblem.getWays(67, coins),
                TheCoinChangeProblem.getWays2(67, coins));

        assertEquals(
                TheCoinChangeProblem.getWays(55, coins),
                TheCoinChangeProblem.getWays2(55, coins));

    }
}
