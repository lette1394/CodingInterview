package Algospot;

import java.util.Arrays;
import java.util.Scanner;

public class Picnic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] f = new int[n][n];

            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                f[a][b] = 1;
                f[b][a] = 1;
            }

            int[] members = new int[n];
            Arrays.fill(members, 1);
            System.out.println(solve(n, m, f, members));
        }
    }

    private static int solve(int n, int m, int[][] f, int[] members) {
        int unlinked = -1;

        for (int i = 0; i < members.length; i++) {
            if (members[i] == 1) {
                unlinked = i;
                break;
            }
        }
        if (unlinked == -1) {
            return 1;
        }

        int ret = 0;
        for (int target = unlinked+1; target < n; target++) {
            if (members[target] == 1 && f[unlinked][target] == 1) {
                members[target] = 0;
                members[unlinked] = 0;

                ret += solve(n, m, f, members);

                members[target] = 1;
                members[unlinked] = 1;
            }
        }

        return ret;
    }
}
