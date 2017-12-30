package Chap1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateTest {
    private Rotate roll;

    @Before
    public void setUp() {
        this.roll = new Rotate();
    }

    @Test
    public void RotateClockWise() {
        assertArrayEquals(new Integer[]{
                1
        }, roll.getArrayRotated(new Integer[]{
                1
        }));

        assertArrayEquals(new Integer[]{
                1, 2,
                1, 1
        }, roll.RotateClockWise(new Integer[]{
                2, 1,
                1, 1
        }));

        assertArrayEquals(new Integer[]{
                1,2,3,
                1,2,1,
                1,1,1
        }, roll.RotateClockWise(new Integer[]{
                3,1,1,
                2,2,1,
                1,1,1
        }));

        assertArrayEquals(new Integer[]{
                1,3,1,
                1,0,1,
                7,3,1
        }, roll.RotateClockWise(new Integer[]{
                1,1,1,
                3,0,3,
                1,1,7
        }));

        assertArrayEquals(new Integer[]{
                1,1,2,3,3,
                1,1,2,3,3,
                1,5,6,1,1,
                1,1,1,1,1,
                8,1,1,1,1
        }, roll.RotateClockWise(new Integer[]{
                3,3,1,1,1,
                3,3,1,1,1,
                2,2,6,1,1,
                1,1,5,1,1,
                1,1,1,1,8
        }));
    }

    @Test
    public void getArrayVaild() {
        assertArrayEquals(new Integer[]{
                3,3,1,1,1,
                1,1,1,8,1,
                1,1,1,1,2,
                3,3,1,1,1,
                1,5,1,2,6
        }, roll.getArrayRotated(new Integer[]{
                3,3,1,1,1,
                3,3,1,1,1,
                2,2,6,1,1,
                1,1,5,1,1,
                1,1,1,1,8
        }));

        assertArrayEquals(new Integer[]{
                3,3,1,1,6,2,2,3,3
        }, roll.getArrayRotated(new Integer[]{
                3,3,1,
                3,3,1,
                2,2,6
        }));

        assertArrayEquals(new Integer[]{
                1,1,2,1
        }, roll.getArrayRotated(new Integer[]{
                1,1,
                1,2
        }));

        assertArrayEquals(new Integer[]{
                1
        }, roll.getArrayRotated(new Integer[]{
                1
        }));

        assertArrayEquals(new Integer[]{
                1,2,3,4
        }, roll.getArrayRotated(new Integer[]{
                1,2,
                4,3
        }));

    }

}