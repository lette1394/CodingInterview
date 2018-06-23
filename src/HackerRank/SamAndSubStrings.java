package HackerRank;

import java.util.Scanner;

public class SamAndSubStrings {

    static long substrings(String balls) {
        // Complete this function
        long result = 0;
        long mod = (int) Math.pow(10, 9) + 7;

        char[] chars = balls.toCharArray();

        long ones = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            int digit = chars[i]-'0';
            ones = (ones*10+1) % mod;

            long sum = (digit * (i+1) * ones) % mod;
            result = (result + sum) % mod;

        }
        return result % mod;
    }

    public static long run() {
        Scanner in = new Scanner(System.in);
        String balls = in.next();
        long result = substrings(balls);
        in.close();

        return (result);
    }
}
