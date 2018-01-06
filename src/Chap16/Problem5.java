package Chap16;

public class Problem5 {

    static String ex1() {
        return "hello world!";
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }

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

}
