package Chap16;

import java.util.Arrays;

public class Problem6 {

    public int getMinAbsValueOfMinusBetweenBRUTE(int[] array1, int[] array2) {
        int minGap = Integer.MAX_VALUE;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                int minusResult = array1[i] - array2[j];
                int absResult = Math.abs(minusResult);

                if (minGap > absResult) {
                    minGap = absResult;
                }
            }
        }

        return minGap;
    }

    public int getMinAbsValueOfMinusBetweenSORT(int[] array1, int[] array2) {
        int minGap = Integer.MAX_VALUE;

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0, j = 0; i < array1.length && j < array2.length;) {
            if (array1[i] > array2[j]) {
                minGap = Math.min(minGap, array1[i] - array2[j]);
                j++;
            }
            else if (array1[i] < array2[j]) {
                minGap = Math.min(minGap, array2[i] - array1[j]);
                i++;
            }
            else {
                return 0;
            }
        }


        return minGap;
    }
}
