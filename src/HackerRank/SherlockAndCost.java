package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SherlockAndCost {

    static int cost(int[] arr) {
        int hi = 0, lo = 0;
        for (int i = 1; i < arr.length; i++) {
            int highToLow = arr[i-1]-1;
            int lowToHigh = arr[i]-1;

            int lo_temp = Math.max(lo, hi+highToLow);
            int hi_temp = Math.max(hi, lo+lowToHigh);

            lo = lo_temp;
            hi = hi_temp;
        }

        return Math.max(hi, lo);
    }


    public static List<Integer> run(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = cost(arr);
            list.add(result);
        }
        in.close();

        return list;
    }
}
