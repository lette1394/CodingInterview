package LeetCode;

public class NumberComplement {
//    https://leetcode.com/problems/number-complement/

// core idea:
//    num          = 00000101
//    mask         = 11111000
//    ~mask & ~num = 00000010

    class Solution {
        public int findComplement(int num) {
            int mask = -1;
            while ((mask & num) != 0) mask <<= 1;
            return ~mask & ~num;
        }
    }

    // To find out where left-most 1, using divide by 2 until num is zero
    class MySolution {
        public int findComplement(int _num) {
            int distance = 0;
            int num = _num;

            while (num != 0) {
                num /= 2;
                distance++;
            }

            int mask = (1 << distance) - 1;

            return mask & (~_num);
        }
    }
}
