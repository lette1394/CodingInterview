package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hanium {

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();

        int front = 0;
        int end = chars.length - 1;

        while (front < end) {
            if (chars[front] != chars[end]) {
                return false;
            }
            front++;
            end--;
        }

        return true;
    }

    public static int squareSum(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i] * arr[i];
        }

        return ret;
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;

        int before = 0;
        int after = stations[0] - w - 1;
        for (int i = 0; i < stations.length - 1; i++) {
            System.out.println(countWithin(before, after, w));

            answer += countWithin(before, after, w);

            before = stations[i] + w + 1;
            after = stations[i + 1] - w - 1;
        }


        answer += countWithin(stations[stations.length - 1] + w + 1, n, w);

        return answer;
    }

    public static int countWithin(int from, int to, int w) {
        if (from > to) {
            return 0;
        }

        if (from == to) {
            return 1;
        }

        int remain = (from - to + 1) % (2 * w + 1);
        int di = (from - to + 1) / (2 * w + 1);

        return remain == 0 ? di : di + 1;
    }
}
