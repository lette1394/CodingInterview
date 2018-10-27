package LeetCode;

public class IntegerBreak {

    // about factor :
    // https://leetcode.com/problems/integer-break/discuss/80721/Why-factor-2-or-3-The-math-behind-this-problem.


    class MySolution {
        int[] dp = new int[100];

        public int integerBreak(int n) {
            if (dp[n] != 0) return dp[n];
            if (n <= 1) return 0;
            if (n <= 2) return 1;
            if (n == 3) return 2;
            if (n == 4) return 4;
            if (n == 5) return 6;
            if (n == 6) return 9;
            if (n == 7) return 12;
            if (n == 8) return 18;
            if (n == 9) return 27;

            int max = 0;
            for (int tryNum = 1; tryNum < n; tryNum++) {
                max = Math.max(max, tryNum * integerBreak(n - tryNum));
            }

            return dp[n] = max;
        }
    }

    public class Solution {
        public int integerBreak(int n) {
            if (n == 2) return 1;
            if (n == 3) return 2;
            int product = 1;
            while (n > 4) {
                product *= 3;
                n -= 3;
            }
            product *= n;

            return product;
        }
    }

    public class Solution2WithLogN {
        public int integerBreak(int n) {
            if (n == 2)
                return 1;
            else if (n == 3)
                return 2;
            else if (n % 3 == 0)
                return (int) Math.pow(3, n / 3);
            else if (n % 3 == 1)
                return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
            else
                return 2 * (int) Math.pow(3, n / 3);
        }

    }
}
