package Algospot;

import java.util.*;
import java.io.*;

public class Picnic {

    public static void main(String[] args) {
        parse();
    }

    private static void solve(boolean[][] valid, int students, int pairs) {
        boolean[] taken = new boolean[students];
        System.out.println(solve(valid, students, taken));
    }

    private static int solve(boolean[][] valid, int students, boolean[] taken) {
        int firstFree = -1;

        for (int i = 0; i < taken.length; i++) {
            if (!taken[i]) {
                firstFree = i;
                break;
            }
        }

        if (firstFree == -1) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < students; i++) {
            if (!taken[i] && valid[firstFree][i]) {
                taken[firstFree] = taken[i] = true;
                count += solve(valid, students, taken);
                taken[firstFree] = taken[i] = false;
            }
        }
        return count;
    }

    private static void parse() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int testCases = Integer.parseInt(st.nextToken());

            for (int i = 0; i < testCases; i++) {
                st = new StringTokenizer(in.readLine());
                int students = Integer.parseInt(st.nextToken());
                int pairs = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(in.readLine());
                boolean[][] valid = new boolean[students][students];

                for (int j = 0; j < pairs; j++) {
                    int y = Integer.parseInt(st.nextToken());
                    int x = Integer.parseInt(st.nextToken());

                    valid[y][x] = true;
                    valid[x][y] = true;
                }
                solve(valid, students, pairs);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
