package Chap16;

public class Problem5 {

    public long getFactorial(long value) {
        if (value == 0 || value == 1) {
            return 1;
        }

        long sum = 1;
        for (long i = 1; i <= value; i++) {
            sum *= i;
        }

        return sum;
    }

    public long getNumberOfTwo(long value) {
        return getCountOnDivide(value, 2);
    }

    public long getNumberOfFive(long value) {
        return getCountOnDivide(value, 5);
    }

    public long getNumberOfTen(long value) {
        return getCountOnDivide(value, 10);
    }

    private long getCountOnDivide(long value, int divider) {
        long temp = value;
        int count = 0;

        while (temp != 0) {
            if (temp % divider == 0) {
                count++;
                temp /= divider;
            } else {
                return count;
            }
        }

        return count;
    }
}
