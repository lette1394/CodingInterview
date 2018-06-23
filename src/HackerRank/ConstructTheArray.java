package HackerRank;

import java.util.*;

public class ConstructTheArray {

    private static int length = 0;
    private static int range = 0;
    private static int shouldLastValue = 0;
    private static long[][] map;

    static long countArray(int length, int range, int shouldLastValue) {
        ConstructTheArray.length = length;
        ConstructTheArray.range = range;
        ConstructTheArray.shouldLastValue = shouldLastValue;

        map = new long[length+10][range+10];
        for (long[] ints : map) {
            Arrays.fill(ints, -1);
        }

        return solve(2, 1) % ((long)Math.pow(10, 9)+7);
    }


    static long solve(int index, int previousValue) {
        if (map[index][previousValue] != -1) {
            return map[index][previousValue];
        }

        if (index > length) {
            return map[index][previousValue] = 0;
        }

        if (index == length) {
            if (previousValue == shouldLastValue) {
                return map[index][previousValue] = 0;
            }
            return map[index][previousValue] = 1;
        }

        long sum = 0;
        for (int i = 1; i <= range; i++) {
            if (i == previousValue) {
                continue;
            }
            sum = (sum + solve(index+1, i)) % ((long)Math.pow(10, 9)+7);
        }

        return map[index][previousValue] = sum % ((long)Math.pow(10, 9)+7);
    }

    static long countArray2(int length, int range, int last) {
        long mod = (long)Math.pow(10, 9) + 7;

        final int VALID = 0;
        final int INVALID = 1;
        final long[][] dp = new long[length][2];
        dp[1][VALID] = (last == 1) ? 0 : 1;
        dp[1][INVALID] = range-1;

        dp[2][VALID] = (last == 1) ? dp[1][INVALID] : dp[1][INVALID]-1;
        dp[2][INVALID] = dp[1][INVALID] * (range-1);

        for (int i = 3; i < length; i++) {
            dp[i][INVALID] = (dp[i-1][INVALID] * (range-1)) % mod;
            dp[i][VALID] = (dp[i-1][INVALID] - dp[i-1][VALID] + mod) % mod;
        }

        return dp[length-1][VALID] % mod;
    }

//    static long countArray3(int n, int k, int x) {
//    final int COMPL = 1, INCOMPL = 0, MOD = 1000000007;
//        // Return the number of ways to fill in the array.
//        long dp[][] = new long[n+1][2];
//
//        dp[2][COMPL] = (x == 1) ? 0L : 1L;
//        dp[2][INCOMPL] = (long)(k-1);
//
//        dp[3][COMPL] = (x == 1) ? dp[2][INCOMPL] : dp[2][INCOMPL] - 1L;
//        dp[3][INCOMPL] = mult(dp[2][INCOMPL], dp[2][INCOMPL]);
//
//        for(int i = 4;i<=n;i++) {
//            dp[i][INCOMPL] = mult(dp[i-1][INCOMPL], dp[2][INCOMPL]);
//            dp[i][COMPL] =  minus(dp[i-1][INCOMPL], dp[i-1][COMPL]);
//        }
//        return dp[n][COMPL];
//    }
//
//    static long add(long a , long b) {
//        return ((a%MOD)+(b%MOD))%MOD;
//    }
//
//    static long mult(long a, long b) {
//        return ((a%MOD)*(b%MOD))%MOD;
//    }
//
//    static long minus(long a, long b) {
//        return (a - b + MOD) %MOD;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        long answer = countArray2(n, k, x);
        System.out.println(answer);
        in.close();
    }
}
