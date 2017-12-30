package Chap1;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ZeroMatrixTest {
    ZeroMatrix zeroMatrix;

    @Before
    public void setUp() {
        zeroMatrix = new ZeroMatrix();
    }

    @Test
    public void oneByOne() {
        assertArrayEquals(new int[][] {
                {0}
        }, zeroMatrix.setZero(new int[][] {
                {0}
        }
        ));
    }

    @Test
    public void twoByOne() {
        assertArrayEquals(new int[][] {
                {0, 0}
        }, zeroMatrix.setZero(new int[][] {
                {8, 0}
        }
        ));
    }

    @Test
    public void twoByOne2() {
        assertArrayEquals(new int[][] {
                {0, 0}
        }, zeroMatrix.setZero(new int[][] {
                {0, 8}
        }
        ));
    }

    @Test
    public void oneByTwo() {
        assertArrayEquals(new int[][] {
                {0},
                {0}
        }, zeroMatrix.setZero(new int[][] {
                {0},
                {5}
        }
        ));
    }

    @Test
    public void oneByTwo2() {
        assertArrayEquals(new int[][] {
                {0},
                {0}
        }, zeroMatrix.setZero(new int[][] {
                {5},
                {0}
        }
        ));
    }

    @Test
    public void TwoByTwo() {
        assertArrayEquals(new int[][] {
                {0, 0},
                {6, 0}
        }, zeroMatrix.setZero(new int[][] {
                {1, 0},
                {6, 7}
        }));
    }

    @Test
    public void fourByThree() {
        assertArrayEquals(new int[][] {
                {1, 0, 3, 4},
                {0, 0, 0, 0},
                {9, 0, 11, 12}
        }, zeroMatrix.setZero(new int[][] {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {9, 10, 11, 12}
        }
        ));
    }

    @Test
    public void fourByThree2() {
        assertArrayEquals(new int[][] {
                {0, 0, 0, 0},
                {5, 6, 7, 0},
                {9, 10, 11, 0}
        }, zeroMatrix.setZero(new int[][] {
                {1, 2, 3, 0},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        }
        ));
    }

    @Test
    public void nineBytwo() {
        assertArrayEquals(new int[][] {
                {1, 2, 3, 4, 0, 6, 7, 8, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, zeroMatrix.setZero(new int[][] {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 0, 6, 7, 8, 9}
        }
        ));
    }

    @Test
    public void fourByThreeDouble() {
        assertArrayEquals(new int[][] {
                {0, 0, 0, 0},
                {5, 0, 7, 0},
                {0, 0, 0, 0}
        }, zeroMatrix.setZero(new int[][] {
                        {1, 2, 3, 0},
                        {5, 6, 7, 8},
                        {9, 0, 11, 12}
                }
        ));
    }

    @Test
    public void nineBytwoDouble() {
        assertArrayEquals(new int[][] {
                {0, 2, 3, 4, 0, 6, 7, 8, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, zeroMatrix.setZero(new int[][] {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 2, 3, 4, 0, 6, 7, 8, 9}
        }
        ));
    }
}
