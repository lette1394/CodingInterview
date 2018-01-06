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

    public int getNumberOfTwo(long value) {
        return getCountOnDivide(value, 2);
    }

    public int getNumberOfFive(long value) {
        return getCountOnDivide(value, 5);
    }

    public int getNumberOfTen(long value) {
        return getCountOnDivide(value, 10);
    }

    private int getCountOnDivide(long originValue, int divider) {
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

    public int minNumberOfTwoOrFive(long factorial) {
        return Math.min(getNumberOfTwo(factorial), getNumberOfFive(factorial));
    }
}
