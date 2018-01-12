package Chap10;

import java.util.Arrays;

public class Problem11 {

    public int[] sortPeakAndValleyInTurn(int[] numbers) {
        int[] sorted = numbers;
        int[] result = new int[numbers.length];

        Arrays.sort(sorted);

        int front, back, i;
        for (i = 0, front = 0, back = sorted.length-1; i < result.length-1;) {
            result[i] = sorted[back];
            i++;
            back--;

            result[i] = sorted[front];
            i++;
            front++;
        }

        if (sorted.length % 2 == 1) {
            result[i] = sorted[back];
        }

        return result;
    }
}
