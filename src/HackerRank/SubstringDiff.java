package HackerRank;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class SubstringDiff {

    private static int solve(int S, String P, String Q) {
        int L = 0;
        int length = P.length();
        int[][][] dp = new int[length+2][length+2][length+2];

        for (int k = 1; k <= length; k++) {
            for (int i = length; i >= 1; i--) {
                for (int j = length; j >= 1; j--) {
                    dp[i][j][k] = dp[i+1][j+1][k-1] + (P.charAt(i-1) == Q.charAt(j-1) ? 0 : 1);

                    if (dp[i][j][k] == S) {
                        L = max(L, k);
                    }
                }
            }
        }

        return L;
    }

    public static void main(String[] args) {
        parseInput();
    }

    private static void parseInput() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            int testCases = Integer.parseInt(in.readLine());

            for (int i = 0; i < testCases; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int S = Integer.parseInt(st.nextToken());
                String P = st.nextToken();
                String Q = st.nextToken();

                System.out.println(solve(S, P, Q));
            }
        } catch (IOException e) {
            e.getStackTrace();
        }

    }

}
