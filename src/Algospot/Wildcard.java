package Algospot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Wildcard {
    public static void main(String[] args) {
        final InputStreamReader reader = new InputStreamReader(System.in);
        final BufferedReader in = new BufferedReader(reader);

        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int testCases = Integer.parseInt(st.nextToken());

            for (int t = 0; t < testCases; t++) {
                String wildString = in.readLine();

                st = new StringTokenizer(in.readLine());
                int size = Integer.parseInt(st.nextToken());

                String[] list = new String[size];
                for (int i = 0; i < size; i++) {
                    list[i] = in.readLine();
                }
                printList(solve(wildString, list));
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }

    private static void printList(List<String> list) {
        for (String st : list) {
            System.out.println(st);
        }
    }

    private static List<String> solve(String wildString, String[] list) {
        List<String> result = new ArrayList<>();
        int[][] cache = new int[101][101];

        for (String candi : list) {
            for (int[] ints : cache) {
                Arrays.fill(ints, -1);
            }

            if (processMatch(cache, wildString.toCharArray(), candi.toCharArray(), 0, 0) == 1) {
                result.add(candi);
            }
        }
        result.sort(String::compareTo);
        return result;
    }

    private static int processMatch(int[][] cache, char[] W, char[] S, int w, int s) {
        if (cache[w][s] != -1) return cache[w][s];

        if (w < W.length && s < S.length && (W[w] == S[s] || W[w] == '?')) {
            return cache[w][s] = processMatch(cache, W, S, w+1, s+1);
        }

        if (w == W.length) {
            return (s == S.length) ? (cache[w][s] = 1) : (cache[w][s] = 0);
        }

        if (W[w] == '*') {
            if (processMatch(cache, W, S, w+1, s) == 1 || (s < S.length && processMatch(cache, W, S, w, s+1) == 1)) {
                return cache[w][s] = 1;
            }
        }
        return cache[w][s] = 0;
    }
}
