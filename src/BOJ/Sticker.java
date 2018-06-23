package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sticker {
    static int[][] cache;

    static int[][] parseArray()  {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);
        int[][] result = new int[][] {{-1}};

        try {
            int size = Integer.parseInt(buf.readLine());
            result = new int[2][size];

            for (int j = 0; j < 2; j++) {
                String line = buf.readLine();
                StringTokenizer token = new StringTokenizer(line);
                for (int i = 0; i < size; i++) {
                    result[j][i] = Integer.parseInt(token.nextToken(" "));
                }
            }

        } catch (IOException e) {
            e.getMessage();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCases; i++) {
            int[][] arr = parseArray();
            System.out.println(solve(arr));
        }
    }

    static int solve(int[][] arr) {
        cache = new int[arr.length][arr[0].length];

        return Math.max(solveImpl(arr, new Index(0,0)), solveImpl(arr, new Index(1,0)));
    }

    static int solveImpl(int[][] arr, Index index) {
        int result;
        boolean up = index.y > 0;

        if (isNotValid(arr, index)) {
            return 0;
        }

        if (cache[index.y][index.x] != 0) {
            return cache[index.y][index.x];
        }

        int nextY = up ? 0 : 1;
        result = Math.max(
                solveImpl(arr, new Index(index.x+1, nextY)),
                solveImpl(arr, new Index(index.x+2, nextY)));

        result += arr[index.y][index.x];

        return cache[index.y][index.x] = result;
    }

    private static boolean isNotValid(int[][] arr, Index index) {
        return (index.x < 0 || index.y < 0 || index.x >= arr[0].length || index.y >= arr.length || arr[index.y][index.x] == -1);
    }
}

class Index {
    int x, y;

    Index(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
