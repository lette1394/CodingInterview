package Chap8;

import java.util.Stack;

public class Problem1 {

    int[] cache = new int[1000];
    Stack<Integer> stack = new Stack<>();

    int climbStairs(int stairs) {
        if (stairs == 0) {
            return 0;
        }
        return goUpWHILE(stairs);
    }

    int goUp(int remain) {
        if (remain < 0){
            return 0;
        }
        if (remain == 0) {
            return 1;
        }
        else {
            if (cache[remain] != 0) {
                return cache[remain];
            }
            return cache[remain] = goUp(remain-1) + goUp(remain-2) + goUp(remain-3);
        }
    }

    int goUpNoCache(int remain) {
        if (remain < 0){
            return 0;
        }
        if (remain == 0) {
            return 1;
        }
        return goUp(remain-1) + goUp(remain-2) + goUp(remain-3);
    }

    int goUpWHILE(int remain) {
        int result = 0;
        int temp;
        int[] cache = new int[10000];

        stack.push(remain);
        while (!stack.empty()) {
            temp = stack.pop();

            if (temp < 0) {
                continue;
            }
            if (temp == 0) {
                result += 1;
                continue;
            }

            stack.push(temp-1);
            stack.push(temp-2);
            stack.push(temp-3);

        }

        return result;
    }
}

