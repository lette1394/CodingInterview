package Chap16;

public class Problem6 {

    public int getMinAbsValueOfMinusBetween(int[] array1, int[] array2) {
        int MIN_VALUE = 987654321;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (MIN_VALUE > Math.abs(array1[i] - array2[j])) {
                    MIN_VALUE = Math.abs(array1[i] - array2[j]);
                }
            }
        }

        return MIN_VALUE;
    }
}
