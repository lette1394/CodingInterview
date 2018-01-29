package Chap5;

public class Problem1 {

    public int solve(int N, int M, int i, int j) {
        int clear = -1 << j;
        int clearHelper = -1 >>> 32-i;

        clear = clear | clearHelper;

        N = N & clear;

        N = N | M << i;

        return N;
    }
}
