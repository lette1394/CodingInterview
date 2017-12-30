package Programmers;

import java.util.Arrays;

class NoOvertime {
    public int noOvertime(int no, int[] works) {
        int[] result = new int[works.length];

        int index = Arrays.stream(works).sum() - no;
        for (int i = 0; i < index; i++) {
            result[i % result.length]++;
        }
        System.out.println(Arrays.toString(result));
        return Arrays.stream(result).map(i -> i * i).sum();
    }
    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int[] test = {16, 29, 27, 1, 9, 18, 7, 3, 27, 2, 1, 16, 26, 2, 3, 8, 25, 0, 24, 29};
        System.out.println(c.noOvertime(214, test));
    }
}
