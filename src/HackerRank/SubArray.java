package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    static int num;
    static int[] list;
    static int count = 0;

    static public void parse() {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        list = new int[num];
        int index = 0;

        while (sc.hasNext()) {
            list[index] = sc.nextInt();
            index++;
        }

        for (int i = 0; i <= list.length; i++) {
            countIfNegativeSubarray(i);
        }

        System.out.println(count);
    }

    static void countIfNegativeSubarray(int length) {
        int result = 0;

        for (int i = 0; i < list.length-length+1; i++) {
            for (int j = 0; j < length; j++) {
                result += list[i+j];
            }
            if (result < 0) {
                count++;
            }
            result = 0;
        }
    }
}
