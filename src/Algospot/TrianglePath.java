package Algospot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TrianglePath {
    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < testCases; t++) {
            int size = Integer.parseInt(in.readLine().trim());
            int[][] triangle = new int[size][size];

            for (int y = 0; y < size; y++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int x = 0; x <= y; x++) {
                    triangle[y][x] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println(solve(triangle, size));
        }
    }

    private static int solve(int[][] tri, int size) {
        int[][] cache = new int[size+1][size+1];

        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }

        return solve(tri, cache, 0, 0);
    }

    private static int solve(int[][] tri, int[][] cache, int y, int x) {
        if (cache[y][x] != -1) return cache[y][x];

        if (!valid(tri, y, x)) return cache[y][x] = 0;

        return cache[y][x] = tri[y][x] + Math.max(solve(tri, cache, y+1, x), solve(tri, cache, y+1, x+1));
    }


    private static boolean valid(int[][] tri, int y, int x) {
        return y < tri.length;
    }
}