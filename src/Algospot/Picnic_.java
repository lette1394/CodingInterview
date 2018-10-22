package Algospot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Picnic_ {
    static boolean[] taken;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine().trim());
        for (int i = 0; i < t; i++) {
            boolean[][] areFriends;
            StringTokenizer st = new StringTokenizer(in.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            areFriends = new boolean[n + 1][n + 1];
            taken = new boolean[n];
            st = new StringTokenizer(in.readLine());

            for (int f = 0; f < m; f++) {
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                areFriends[from][to] = true;
                areFriends[to][from] = true;
            }

            System.out.println(solve(areFriends, n, m));
        }

    }

    private static int getNextPal() {
        for (int i = 0; i < taken.length; i++) {
            if (taken[i]) continue;

            return i;
        }

        return -1;
    }

    private static int solve(boolean[][] areFriends, int n, int m) {
        

        int count = 0;
        int next = getNextPal();
        if (next == -1) return 1;

        for (int i = next + 1; i < n; i++) {
            if (areFriends[next][i] && !taken[i]) {
                taken[i] = taken[next] = true;
                count += solve(areFriends, n, m);
                taken[i] = taken[next] = false;
            }
        }

        return count;
    }
}
