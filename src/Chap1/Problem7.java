package Chap1;

import java.util.Arrays;

public class Problem7 {

    public int[][] rotate(int[][] input) {
        int[][] result = new int[input[0].length][input.length];

        if (result.length == input.length) {
            return input;
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                result[j][i] = input[i][j];
            }
        }

        for (int i = 0; i < input.length; i++) {
            result[i][0] = input[0][i];
        }





        return result;
    }
}
