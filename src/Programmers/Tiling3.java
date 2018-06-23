package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tiling3 {
    static int[] cache = new int[5000];

    public static int solution(int remain) {
        if (remain < 0) {
            return 0;
        }
        if (remain == 0) {
            return 1;
        }

        if (cache[remain] != 0) {
            return cache[remain];
        }

        return cache[remain] = (solution(remain - 1) + solution(remain - 2)) % 1000000007;
    }

    public static int solve3(int number) {
        return 0;
    }
}
