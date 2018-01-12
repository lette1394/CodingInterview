package Chap10;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Problem11Test {

    Problem11 p11;

    @Before
    public void before() {
        this.p11 = new Problem11();
    }

    @Test
    public void main() {
        assertArrayEquals(new int[] {
                5, 1, 3, 2, 3
        }, p11.sortPeakAndValleyInTurn(new int[] {
                5, 3, 1, 2, 3
        }));
    }


}
