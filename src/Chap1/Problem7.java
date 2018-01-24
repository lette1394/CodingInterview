package Chap1;

import java.util.Arrays;

public class Problem7 {

    public int[][] rotate(int[][] input) {
        int[][] result = new int[input[0].length][input.length];

        //check equal
        if (result.length == input.length) {
            return input;
        }

        //copy
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                result[j][i] = input[i][j];
            }
        }

        //row to col
        for (int i = 0; i < input[0].length; i++) {
            result[i][0] = input[0][i];
        }

        //col to row
        int col = input.length-1;
        for (int i = 0; i < input.length; i++) {
            result[0][i] = input[col-i][0];
        }







        return result;
    }
}
