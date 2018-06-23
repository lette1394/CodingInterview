package Algospot;

import java.util.*;
import java.io.*;

public class ClockSync {
    static int[][] switches = new int[][] {
            {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
    };

    private static final int INF = 987654321;

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int testCases = Integer.parseInt(st.nextToken());

            for (int i = 0; i < testCases; i++) {
                int[] clocks = new int[16];
                st = new StringTokenizer(in.readLine());
                for (int e = 0; e < clocks.length; e++) {
                    clocks[e] = Integer.parseInt(st.nextToken());
                }

                System.out.println(solveR(clocks, 0));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int solveR(int[] clocks, int swtch) {
        if (swtch == switches.length) {
            return valid(clocks) ? 0 : INF;
        }

        int ret = INF;
        for (int count = 0; count < 4; count++) {
            ret = Math.min(ret, count + solveR(clocks, swtch+1));
            pressSwitch(clocks, swtch);
        }

        return ret;
    }

    private static int solve(int[] clocks) {
        int[] switchOrder = new int[] {
            4, 1, 9, 3, 7, 8, 0, 5, 6, 2,
        };

        int[] clockOrder = new int[] {
            8, 11, 13, 6, 7, 5, 1, 0, 3, 4
        };

        int count = 0;
        for (int i = 0; i < switchOrder.length; i++) {
            while (clocks[clockOrder[i]] % 12 != 0) {
                pressSwitch(clocks, switchOrder[i]);
                count++;
            }
        }

        if (!valid(clocks)) {
            return -1;
        }

        return count;
    }

    private static boolean valid(int[] clocks) {
        for (int i = 0; i < clocks.length; i++) {
            if (clocks[i] % 12 != 0) {
                return false;
            }
        }

        return true;
    }

    private static void pressSwitch(int[] clocks, int id) {
        int[] switch0 = switches[id];

        for (int i = 0; i < clocks.length; i++) {
            clocks[i] += switch0[i] * 3;
        }
    }
}
