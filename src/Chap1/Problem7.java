package Chap1;

import java.util.Arrays;

public class Problem7 {

    public int[][] rotate(int[][] input) {
        if (input == null) {
            return null;
        }

        int[][] result = new int[input[0].length][input.length];

        //copy
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                result[j][i] = input[i][j];
            }
        }


        int temp = input[0][0];


        //row to col
        for (int k = 0; k < input.length; k++) {
            for (int i = 0; i < input[0].length; i++) {
                result[i][k] = input[k][i];
            }
        }


        //col to row
        int col = input.length-1;
        for (int k = 0; k < input[0].length; k++) {
            for (int i = 0; i < input.length; i++) {
                result[k][i] = input[col-i][k];
            }
        }



        return result;
    }
}
