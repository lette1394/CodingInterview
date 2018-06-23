package HackerRank;

import java.util.Arrays;

public class TheCoinChangeProblem {
    private static long[][] cache = new long[200][15];
    private static long[] cache2 = new long[500];

    static long getWays(long total, long[] coins){

        for (long[] longs : cache) {
            Arrays.fill(longs, -1);
        }
        long result = getWaysImpl(total, coins, 0);

        return result;
    }

    static long getWaysImpl(long money, long[] coins, int index) {
        if (index >= coins.length || money < 0) {
            return 0;
        }

        if (money == 0) {
            return 1;
        }

        if (cache[(int)money][index] != -1) {
            return cache[(int)money][index];
        } else {
            return cache[(int)money][index] = getWaysImpl(money, coins, index+1)
                    + getWaysImpl(money - coins[index], coins, index);
        }
    }

    static void printArray(long[][] arr) {
        for (long[] longs : arr) {
            for (long l : longs) {
                System.out.print(l + "\t\t");
            }
            System.out.println();
        }
    }

    static long getWays2(long total, long[] coins) {
        Arrays.fill(cache2, -1);
        return getWays2Impl(total, coins);
    }

    static long getWays2Impl(long total, long[] coins) {
        if (total < 0) {
            return 0;
        }

        if (total == 0) {
            return 1;
        }

        if (cacheValuePopulate(total)) {
            return cacheValue(total);
        }

        long sum = 0;
        for (int i = 0; i < coins.length; i++) {
            long target = total-coins[i];
            long[] subArr = Arrays.copyOfRange(coins, i, coins.length);
            long result = getWays2(target, subArr);

            sum += result;
        }

        return cache2[(int)total] = sum;
    }

    private static long cacheValue(long total) {
        return cache2[(int)total];
    }

    private static boolean cacheValuePopulate(long total) {
        return cache2[(int)total] != -1;
    }


}
