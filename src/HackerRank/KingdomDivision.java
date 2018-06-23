package HackerRank;

import java.util.*;

public class KingdomDivision {

    static int kingdomDivision(int n, int[][] roads) {

        int[] dp = new int[n];

        for (int col = roads.length-1; col >= 0; col--) {
            int sum = 0;
            int count = 0;
            for (int row = col+1; row < roads[0].length; row++) {
                if (roads[col][row] == 0) {
                    continue;
                }
                count++;
                sum += dp[row];
            }
            if (count != 0) {
                dp[col] = sum + 2;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] roads = new int[n][n];

        for(int i = 0; i < n-1; i++){
            int row = in.nextInt()-1;
            int col = in.nextInt()-1;

            roads[row][col] = 1;
            roads[col][row] = 1;
        }
        int result = kingdomDivision(n, roads);
        System.out.println(result);
        in.close();
    }
}
