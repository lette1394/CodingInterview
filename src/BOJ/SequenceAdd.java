package BOJ;

import java.util.*;
import java.io.*;

public class SequenceAdd {
    private static int solve2(int[] arr) {
        int[] cache = new int[arr.length];
        cache[0] = arr[0];

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (cache[i-1] < 0) {
                continue;
            }

            if (cache[i-1] + arr[i] > 0) {
                cache[i] += arr[i] + cache[i-1];
            }

            if (max < cache[i]) {
                max = cache[i];
            }
        }

        if (max <= 0) {
            Arrays.sort(arr);
            return arr[arr.length-1];
        }
        return max;
    }

    private static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ) {
            int sum = arr[i];

            if (sum < 0) {
                i++;
                continue;
            }

            int j = i+1;
            while (sum >= 0 && j < arr.length) {
                if (arr[j] < 0) {
                    max = Math.max(max, sum);
                }
                sum += arr[j];
                j++;
            }
            i = j;
            max = Math.max(max, sum);
        }

        if (max < 0) {
            Arrays.sort(arr);
            return arr[arr.length-1];
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        int n = Integer.parseInt(in.readLine());
        StringTokenizer t = new StringTokenizer(in.readLine());

        int[] arr = new int[n];
        int i = 0;
        while (t.hasMoreTokens()) {
            arr[i] = Integer.parseInt(t.nextToken());
            i++;
        }

        System.out.println(solve2(arr));
    }
}
