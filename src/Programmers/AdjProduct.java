package Programmers;

import java.util.Arrays;
import java.util.Vector;

public class AdjProduct {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateImage(new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}})));

        System.out.println(Arrays.deepToString(rotateImage(new int[][] {
                {10,9,6,3,7},
                {6,10,2,9,7},
                {7,6,3,8,2},
                {8,9,7,9,9},
                {6,8,6,8,2}
        })));
    }






    static int[][] rotateImage(int[][] a) {
        int[] temp = new int[a[0].length];
        int length = a[0].length;

        for (int stage = 0; stage < length / 2; stage++) {
            for (int i = stage; i < length - stage; i++) {
                //TOP to save
                temp[i] = a[stage][length - i - 1];
            }
            for (int i = stage; i < length - stage; i++) {
                //LEFT to TOP
                a[stage][length - i - 1] = a[i][stage];
            }

            for (int i = stage; i < length - stage; i++) {
                //BOTTOM to LEFT
                a[i][stage] = a[length - stage - 1][i];
            }

            for (int i = stage; i < length - stage; i++) {

                //RIGHT to BOTTOM
                a[length - stage - 1][i] = a[length - i - 1][length - stage - 1];
            }

            for (int i = stage; i < length - stage; i++) {
                //save to RIGHT
                a[length - i - 1][length - stage - 1] = temp[i];
            }
        }
        return a;
    }

    int[][] rotateOTHER(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp = a[i][j];
                a[i][j] = a[n-j-1][i];
                a[n-j-1][i] = a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i] = temp;
            }
        }

        return a;
    }



}
