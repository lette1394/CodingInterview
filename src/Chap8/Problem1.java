package Chap8;

public class Problem1 {

    int[] cache = new int[1000];

    int climbStairs(int stairs) {
        if (stairs == 0) {
            return 0;
        }
        return goUp(stairs);
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
}



