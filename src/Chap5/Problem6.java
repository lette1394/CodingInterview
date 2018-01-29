package Chap5;

public class Problem6 {

    public int solve(int from, int to) {
        int XOR = from ^ to;

        System.out.println(Integer.toBinaryString(from));
        System.out.println(Integer.toBinaryString(to));
        System.out.println(Integer.toBinaryString(XOR));

        int result = 0;

        while (XOR != 0) {
            if (XOR % 2 == 1) {
                result++;
            }
            XOR >>>= 1;
        }

        return result;
    }
}
