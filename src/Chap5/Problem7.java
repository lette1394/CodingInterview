package Chap5;

public class Problem7 {

    public String solve(int input) {
        int temp = input;
        int result = 0b00;
        int mask = -1 >>> 30;

        System.out.println(mask);

        if (temp == 1 || temp == 2) {
            result |= ~temp;
            result &= mask;
        } else {
            result |= temp;
        }

        return Integer.toBinaryString(result);
    }
}
