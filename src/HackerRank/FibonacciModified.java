package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
    static BigInteger fibonacciModified(int t1, int t2, int n) {
        // Complete this function

        BigInteger before = BigInteger.valueOf(t1);
        BigInteger next = BigInteger.valueOf(t2);
        BigInteger result = BigInteger.ZERO;
        int count = 0;

        while (count < n-2) {
            result = before.add(next.multiply(next));
            before = next;
            next = result;

            count++;
        }

        return result;
    }

    public static String run() {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        in.close();

        return result.toString();
    }
}
