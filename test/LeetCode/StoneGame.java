package LeetCode;

// https://leetcode.com/problems/stone-game/


public class StoneGame {

    // the core idea : dp[i][j] is max value in piles[i], piles[i+1], piles[i+2], ..., piles[j]

    // code implementation tips
    // 1. set range i to j using 'size' variable (below 2-way iteration)
    // 2. representation each player's TURN using parity => (j + i + N) % 2

    class Solution {
        public boolean stoneGame(int[] piles) {
            int N = piles.length;

            int[][] dp = new int[N+2][N+2];
            for (int size = 1; size <= N; ++size) {
                for (int i = 0; i + size <= N; ++i) {
                    int j = i + size - 1;

                    // parity can be [(j-i) % 2, (i+j) % 2, ...]
                    int parity = (j + i + N) % 2;

                    if (parity == 1) {
                        dp[i+1][j+1] = Math.max(piles[i] + dp[i+2][j+1], piles[j] + dp[i+1][j]);
                    } else {
                        dp[i+1][j+1] = Math.min(-piles[i] + dp[i+2][j+1], -piles[j] + dp[i+1][j]);
                    }
                }
            }

            return dp[1][N] > 0;

        }
    }
}
