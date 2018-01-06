package Chap16;

public class Problem5 {

    public int getFactorial(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }

        int sum = 1;
        for (int i = 1; i <= value; i++) {
            sum *= i;
        }

        return sum;
    }

    public int getNumberOfTwo(int value) {
        int temp = value;
        int count = 0;

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

    public int getNumberOfFive(int value) {
        int temp = value;
        int count = 0;

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

    public int getNumberOfTen(int value) {
        int temp = value;
        int count = 0;

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
