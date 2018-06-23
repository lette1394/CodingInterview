package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinimumDeletions {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < testCases; i++) {
            int length = Integer.parseInt(in.readLine());
            int[] arr = new int[length];

            StringTokenizer st = new StringTokenizer(in.readLine());

            for (int arr_i = 0; arr_i < length; arr_i++) {
                arr[arr_i] = Integer.parseInt(st.nextToken());
            }

            System.out.println(solveMiminum(arr));
        }
    }

    private static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    private static int solveMiminum(int[] arr) {
        Arrays.sort(arr);

        int count = 0;
        for (int prev = 0; prev < arr.length; prev++) {
            if (arr[prev] == -1 || arr[prev] == 1) {
                continue;
            }
            for (int next = prev + 1; next < arr.length; next++) {
                if (arr[next] == -1) {
                    continue;
                }
                if (GCD(arr[prev], arr[next]) != 1) {
                    arr[next] = -1;
                    count++;
                }
            }
        }

        int countPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPositive++;
            }
        }

        return countPositive > 1 ? count : -1;
    }
}
