package Chap16;

public class Problem5 {

    public long getFactorial(long value) {
        if (value == 0 || value == 1) {
            return 1;
        }

        long result = 1;
        for (long i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
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

    private long getCountOnDivide(long originValue, int divider) {
        long dividedValue = originValue;
        int count = 0;

        while (dividedValue != 0) {
            if (dividedValue % divider == 0) {
                count++;
                dividedValue /= divider;
            }
            else {
                return count;
            }
        }

        return count;
    }
}
