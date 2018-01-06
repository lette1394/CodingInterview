package Chap16;

public class Problem6 {

    public int getMinAbsValueOfMinusBetween(int[] array1, int[] array2) {
        int MIN_VALUE = 987654321;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                int minusResult = array1[i] - array2[j];
                int absResult = Math.abs(minusResult);

                if (MIN_VALUE > absResult) {
                    MIN_VALUE = absResult;
                }
            }
        }

        return MIN_VALUE;
    }
}
