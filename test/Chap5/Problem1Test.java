package Chap5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {
    Problem1 p = new Problem1();

    @Test
    public void test1() {
        int N = 0b0100_0000_0000;
        int M = 0b0000_0001_0011;
        int K = 0b0100_0100_1100;
        int i = 2;
        int j = 6;

        assertEquals(K, p.solve(N, M, i, j));
    }

    @Test
    public void test2() {
        int N = 0b1100_1010_0011;
        int M = 0b0000_0001_0011;
        int K = 0b1100_1100_1111;
        int i = 2;
        int j = 6;

        assertEquals(K, p.solve(N, M, i, j));
    }

    @Test
    public void test3() {
        int N = 0b1100_1010_0011;
        int M = 0b0000_0001_0011;
        int K = 0b1101_0011_0011;
        int i = 4;
        int j = 8;

        assertEquals(K, p.solve(N, M, i, j));
    }
}
