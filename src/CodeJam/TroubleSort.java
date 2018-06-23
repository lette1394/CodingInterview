package CodeJam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TroubleSort {
    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int testCases = Integer.parseInt(st.nextToken());

        for (int t = 1; t <= testCases; t++) {
            st = new StringTokenizer(in.readLine());
            int length = Integer.parseInt(st.nextToken());
            int[] arr = new int[length];

            st = new StringTokenizer(in.readLine());
            for (int a = 0; a < length; a++) {
                arr[a] = Integer.parseInt(st.nextToken());
            }
            int result = solve(arr);
            System.out.print("Case #" + t + ": ");
            System.out.println(result == -1 ? "OK" : result);
        }
    }

    private static int solve(int[] arr) {
        sortTrouble(arr);

        return getInvalidIndex(arr);
    }

    private static void sortTrouble(int[] arr) {
        boolean done = false;

        while (!done) {
            done = true;

            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i] > arr[i+2]) {
                    done = false;
                    int temp = arr[i];
                    arr[i] = arr[i+2];
                    arr[i+2] = temp;
                }
            }
        }
    }

    private static int getInvalidIndex(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return i;
            }
        }

        return -1;
    }
}
