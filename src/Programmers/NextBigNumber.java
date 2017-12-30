package Programmers;

public class NextBigNumber {
    public static int nextBigNumber(int n) {
        int compare = n + 1;

        while(true) {
            if (Integer.bitCount(compare) == Integer.bitCount(n))
                break;
            compare++;
        }

        return compare;
    }

    public static void main(String[] args) {
        int n = 78;
        System.out.println(nextBigNumber(n));
    }
}