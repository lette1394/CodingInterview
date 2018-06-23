package HackerRank;

import java.util.*;
import java.io.*;

public class TheMaximumSubarray {

    static int[] maxSubarray(int[] arr) {
        // Complete this function

        return new int[] { getMaxSubArray(arr), getMaxSubSequence(arr) };
    }

    static int getMaxSubArray(int[] arr) {
        int ans = arr[0];
        int temp = ans;
        for (int i = 1; i < arr.length; i++) {
            temp = Math.max(arr[i], temp + arr[i]);
            ans = Math.max(ans, temp);
        }

        return ans;
    }

    static int getMaxSubSequence(int[] arr) {

        int sum = 0;
        int minus = Integer.MIN_VALUE;
        for (int i : arr) {
            minus = Math.max(minus, i);

            if (i > 0) {
                sum += i;
            }
        }
        return minus > 0 ? sum : minus;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = maxSubarray(arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
