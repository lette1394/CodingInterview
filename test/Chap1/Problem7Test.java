package Chap1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem7Test {
    Problem7 p = new Problem7();

    @Test
    public void nullTest() {
        assertArrayEquals(null, p.rotate(null));
    }

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

    @Test
    public void TwoByTwo() {
         assertArrayEquals(new int[][] {
                        {33, 11},
                        {44, 22}
                },
                p.rotate(new int[][] {
                        {11, 22},
                        {33, 44}
                }));
    }

    @Test
    public void ThreeByTwo() {
        assertArrayEquals(new int[][] {
                        {55, 33, 11},
                        {66, 44, 22}
                },
                p.rotate(new int[][] {
                        {11, 22},
                        {33, 44},
                        {55, 66}
                }));

        assertArrayEquals(new int[][] {
                        {5, 3, 1},
                        {6, 4, 2}
                },
                p.rotate(new int[][] {
                        {1, 2},
                        {3, 4},
                        {5, 6}
                }));
    }






}
