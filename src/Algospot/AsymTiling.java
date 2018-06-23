package Algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsymTiling {
    private static int[] cache = new int[101];
    private static int[] cache2 = new int[101];
    private static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        for (int t = 0; t < testCases; t++) {
            int num = Integer.parseInt(in.readLine());
            clearCache(cache);
            clearCache(cache2);

            System.out.println(solve2(num));
        }
    }

    private static void clearCache(int[] cache) {
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
    }

    private static int solve(int num) {
        int total = solveTotal(num);
        int rest = solveTotal(num / 2);

        if (num % 2 == 1) {
            return (total - rest + MOD) % MOD;
        } else {
            int result = total;
            result = (result - rest + MOD) % MOD;
            result = (result - solveTotal(num / 2 - 1) + MOD) % MOD;

            return result;
        }
    }

    private static int solve2(int num) {
        if (num < 0) {
            return 0;
        }

        if (cache2[num] != -1) {
            return cache2[num];
        }

        int ret = solve2(num - 2) % MOD;
        ret = (ret + solve2(num - 4)) % MOD;
        ret = (ret + solveTotal(num - 3)) % MOD;
        ret = (ret + solveTotal(num - 3)) % MOD;

        return cache2[num] = ret;
    }

    private static int solveTotal(int num) {
        if (num < 0) {
            return 0;
        }
        if (num == 0) {
            return 1;
        }

        if (cache[num] != -1) {
            return cache[num];
        }

        return cache[num] = (solveTotal(num - 1) + solveTotal(num - 2)) % MOD;
    }
}
