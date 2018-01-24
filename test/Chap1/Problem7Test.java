package Chap1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem7Test {
    Problem7 p = new Problem7();

    @Test
    public void one() {
        assertArrayEquals(new int[][] {
                        {0}
                },
                p.rotate(new int[][] {
                        {0}
                }));

        assertArrayEquals(new int[][] {
                        {1}
                },
                p.rotate(new int[][] {
                        {1}
                }));

        assertArrayEquals(new int[][] {
                        {2}
                },
                p.rotate(new int[][] {
                        {2}
                }));
    }

    @Test
    public void TwoByOne() {
        assertArrayEquals(new int[][] {
                        {11},
                        {22}
                },
                p.rotate(new int[][] {
                        {11, 22}
                }));

        assertArrayEquals(new int[][] {
                        {100},
                        {1}
                },
                p.rotate(new int[][] {
                        {100, 1}
                }));
    }

    @Test
    public void ThreeByOne() {
        assertArrayEquals(new int[][] {
                        {11},
                        {22},
                        {33}
                },
                p.rotate(new int[][] {
                        {11, 22, 33}
                }));

        assertArrayEquals(new int[][] {
                        {100},
                        {200},
                        {300}
                },
                p.rotate(new int[][] {
                        {100, 200, 300}
                }));
    }

    @Test
    public void FourByOne() {
        assertArrayEquals(new int[][] {
                        {11},
                        {22},
                        {33},
                        {44}
                },
                p.rotate(new int[][] {
                        {11, 22, 33, 44}
                }));
    }

    @Test
    public void OneByTwo() {
        assertArrayEquals(new int[][] {
                        {22, 11}
                },
                p.rotate(new int[][] {
                        {11},
                        {22}
                }));
    }

    @Test
    public void OneByFour() {
        assertArrayEquals(new int[][] {
                        {22, 11, 77, 88}
                },
                p.rotate(new int[][] {
                        {88},
                        {77},
                        {11},
                        {22}
                }));
    }




}
