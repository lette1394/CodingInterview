package CodeJam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RideBus {
    private static int Answer;
    private static int N;
    private static int K;
    private static int lastRidedIdx = 0;

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Answer = 0;
        N = 0;
        K = 0;
        lastRidedIdx = 0;

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
            Answer = solve(arr);

            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    public static int solve(int[] performance) {
        boolean[] isRide = new boolean[N];
        int count = 0;

        while (true) {
            int nextPerson = getNextPerson(isRide);
            if (nextPerson == -1) {
                break;
            }
            ridePeople(nextPerson, performance, isRide);
            count++;
            isRide[nextPerson] = true;
        }

        return count;
    }

    private static void ridePeople(int nextIdx, int[] performance, boolean[] isRide) {
        int idx = nextIdx;
        for (int i = 0; i < N; i++) {
            if (isRide[i]) {
                continue;
            }

            int gap = performance[idx] + K;

            if (gap < performance[i]) {
                isRide[i] = true;
                idx = i;
            }
        }
    }

    private static int getNextPerson(boolean[] isRide) {
        for (int i = lastRidedIdx; i < N; i++) {
            if (!isRide[i]) {
                lastRidedIdx = i;
                return i;
            }
        }
        return -1;
    }
}

