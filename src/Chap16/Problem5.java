package Chap16;

public class Problem5 {

    static String ex1() {
        return "hello world!";
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }

    public int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }

        return sum;
    }
}
