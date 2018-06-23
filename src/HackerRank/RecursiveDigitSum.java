package HackerRank;

import java.util.*;

public class RecursiveDigitSum {

    static int digitSum(String n, int k) {

        int result = impl(n);

        result = result * k;

        return impl(result);
    }

    static int impl(String num) {

        int result = 0;
        for (char ch : num.toCharArray()) {
            result += ch-'0';
        }

        if (num.length() == 1) {
            return Integer.parseInt(num);
        }
        return impl(result);
    }

    static int impl(int num) {
        return impl(String.valueOf(num));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = digitSum(n, k);
        System.out.println(result);
        in.close();
    }
}
