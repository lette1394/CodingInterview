package Chap16;

import java.util.*;

public class Problem23 {

    public static void solve() {
        Random random = new Random();
        int[] temp = new int[35];

        for (int i = 0; i < temp.length; i += 5) {
            int index = random.nextInt(5);
            temp[i+index] = 1;
        }

        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < temp.length; i += 7) {
            int count = 0;
            for (int j = i; j < 7; j++) {
                if (j == 1) {
                    System.out.println(count);
                    break;
                }
                count++;
            }
        }

        Queue queue = new ArrayDeque();

    }
}
