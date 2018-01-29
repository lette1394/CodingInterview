package Chap5;

public class Problem4 {

    public String solve(int input) {

        String stringBinary = Integer.toBinaryString(input);
        char[] charsBinary = stringBinary.toCharArray();

        int count = 0;
        for (char ch : charsBinary) {
            if (ch == '1') {
                count++;
            }
        }

        int max = -1 << 32-count;
        max = max >>> 1;
        int min = -1 << count-1;
        min = ~min;

        int mask = 1 << 31;
        min = min | mask;

        System.out.println(Integer.toBinaryString(input));
        System.out.println(input);

        System.out.println(Integer.toBinaryString(max));
        System.out.println(max);

        System.out.println(Integer.toBinaryString(min));
        System.out.println(min);

        return "";
    }
}
