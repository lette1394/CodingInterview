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

        assertArrayEquals(new int[] {
                8, 2, 6, 3, 6, 4, 5
        }, p11.sortPeakAndValleyInTurn(new int[] {
                5, 8, 6, 2, 3, 4, 6
        }));

        assertArrayEquals(new int[] {
                10,1,9,2,8,3,7,4,6,5,5,5,5,5,5
        }, p11.sortPeakAndValleyInTurn(new int[] {
                1,2,3,4,5,5,5,5,5,5,6,7,8,9,10
        }));

        assertArrayEquals(new int[] {
                10,1,9,2,8,3,7,4,6,5,5,5,5,5,5
        }, p11.sortPeakAndValleyInTurn(new int[] {
                1,2,3,4,5,5,5,5,5,5,6,7,8,9,10
        }));
    }

    @Test
    public void boundary() {
        assertArrayEquals(new int[] {
                0
        }, p11.sortPeakAndValleyInTurn(new int[] {
                0
        }));

        assertArrayEquals(new int[] {
                1
        }, p11.sortPeakAndValleyInTurn(new int[] {
                1
        }));

        assertArrayEquals(new int[] {
                1, 0
        }, p11.sortPeakAndValleyInTurn(new int[] {
                0, 1
        }));
    }

}
