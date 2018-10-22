package CodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RideBus {
    private static int N;
    private static int K;

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = 0;
        K = 0;

        int T = Integer.parseInt(in.readLine());
        for (int test_case = 0; test_case < T; test_case++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            int arr[] = new int[N];
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println("Case #" + (test_case + 1));
            System.out.println(solve(arr));
        }
    }

    public static int solve(int[] performance) {
        int count = 1;
        int[] lo = new int[N];
        Arrays.fill(lo, 987654321);
        int[] hi = new int[N];
        Arrays.fill(hi, -987654321);

        for (int i = 0; i < N; i++) {
            boolean isNewBus = rideToBus(performance[i], lo, hi, count);

            if (isNewBus) {
                count++;
            }
        }

        return count;
    }
    
    private static boolean rideToBus(int performance, int[] lo, int[] hi, int busCount) {
        for (int i = 0; i < busCount; i++) {
            if (!(lo[i] <= performance && performance <= hi[i])) {
                hi[i] = Math.max(performance + K, hi[i]);
                lo[i] = Math.min(performance - K, lo[i]);

                return false;
            }
        }

        return true;
    }
}

