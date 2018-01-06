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
        long temp = value;
        long count = 0;

        while (temp != 0) {
            if (temp % 2 == 0) {
                count++;
                temp /= 2;
            } else {
                return count;
            }
        }

        return 0;
    }

    public long getNumberOfFive(long value) {
        long temp = value;
        long count = 0;

        while (temp != 0) {
            if (temp % 5 == 0) {
                count++;
                temp /= 5;
            } else {
                return count;
            }
        }

        return 0;
    }

    public long getNumberOfTen(long value) {
        long temp = value;
        long count = 0;

        while (temp != 0) {
            if (temp % 10 == 0) {
                count++;
                temp /= 10;
            } else {
                return count;
            }
        }
        return 0;
    }



}
