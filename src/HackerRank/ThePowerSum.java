package HackerRank;

import java.util.Scanner;

public class ThePowerSum {
    static int powerSum(int X, int N) {

        return impl(X, 1, N);
    }

    static int impl(int value, int number, int N) {
        if (value == 0) {
            return 1;
        }

        int temp = (int)Math.pow(number, N);

        if (value < 0 || value < temp) {
            return 0;
        }

        return impl(value-temp, number+1, N) + impl(value, number+1, N);
    }

    public static int run() {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N);
        in.close();

        return (result);
    }
}
