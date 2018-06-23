package Algospot;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Pi {
    private static int[] cache;

    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int testCases = Integer.parseInt(st.nextToken());

        for (int t = 0; t < testCases; t++) {
            st = new StringTokenizer(in.readLine());

            System.out.println(solve(st.nextToken()));
        }
    }

    private static int solve(String str) {
        cache = new int[str.length()+1];
        Arrays.fill(cache, -1);

        return solve(str.toCharArray(), 0);
    }

    private static int solve(char[] str, int start) {
        if (!valid(str, start)) return 0;

        if (cache[start] != -1) return cache[start];

        int ret = 987654321;

        for (int i = 3; i <= 5; i++) {
            if (allEquals(str, start, i)) {
                ret = min(ret, solve(str, start+i) + 1);
            }
            if (monotone(str, start, i, true)) {
                ret = min(ret, solve(str, start+i) + 2);
            }
            if (monotone(str, start, i, false)) {
                ret = min(ret, solve(str, start+i) + 2);
            }
            if (trampolin(str, start, i)) {
                ret = min(ret, solve(str, start+i) + 4);
            }
            if (equalDiff(str, start, i)) {
                ret = min(ret, solve(str, start+i) + 5);
            }
            if (others(str, start, i)) {
                ret = min(ret, solve(str, start+i) + 10);
            }
        }

        return cache[start] = ret;
    }

    private static boolean others(char[] str, int start, int len) {
        if (start+len > str.length) return false;

        return true;
    }

    private static boolean equalDiff(char[] str, int start, int len) {
        if (start+len > str.length) return false;

        for (int i = start+1; i < start+len; i++) {
            if (str[i]-str[i-1] != str[start+1]-str[start]) {
                return false;
            }
        }

        return true;
    }

    private static boolean trampolin(char[] str, int start, int len) {
        if (start+len > str.length) return false;

        char before = str[start];
        char next = str[start+1];

        boolean flag = true;
        for (int i = start+2; i < start+len; i++) {
            char origin = flag ? before : next;

            if (origin != str[i]) {
                return false;
            }
            flag = !flag;
        }

        return true;
    }

    private static boolean monotone(char[] str, int start, int len, boolean isUp) {
        if (start+len > str.length) return false;

        int diff = isUp ? 1 : -1;
        for (int i = start+1; i < start+len; i++) {
            if (str[i-1] + diff != str[i]) {
                return false;
            }
        }

        return true;
    }

    static boolean allEquals(char[] str, int start, int len) {
        if (start+len > str.length) return false;

        for (int i = start+1; i < start+len; i++) {
            if (str[i-1] != str[i]) {
                return false;
            }
        }

        return true;
    }

    private static boolean valid(char[] str, int start) {
        return start < str.length;
    }
}
