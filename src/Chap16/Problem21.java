package Chap16;

import java.util.HashSet;
import java.util.Set;

public class Problem21 {
    static int[] solve(int[] arr1, int[] arr2) {
        int[] result = new int[2];

        int sumOfArr1 = 0;
        int sumOfArr2 = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            sumOfArr1 += i;
            set1.add(i);
        }

        for (int i : arr2) {
            sumOfArr2 += i;
            set2.add(i);
        }

        int gap = Math.abs(sumOfArr1-sumOfArr2) / 2;

        for (int i : arr1) {
            int target = gap+i;

            if (set2.contains(target)) {
                result[0] = i;
                result[1] = target;

                return result;
            }
        }

        for (int i : arr2) {
            int target = gap+i;

            if (set1.contains(target)) {
                result[0] = i;
                result[1] = target;

                return result;
            }
        }


        return result;
    }
}
