package BOJ;

import java.util.*;

public class ThreeKang {

    private static Map<Integer, Integer> cache = new HashMap<>();

    private static int container(int a, int b, int c) {
        cache.clear();

        return solve(a, b, c);
    }

    private static int solve(int a, int b, int c) {

        if (cache.containsKey(100*a + 10000*b + 1000000*c)) {
            return cache.get(100*a + 10000*b + 1000000*c);
        }


        int max = 0;

        for (int i = b+1; i < c; i++) {
            max = Math.max(max, solve(b, i, c)+1);
        }

        for (int i = a+1; i < b; i++) {
            max = Math.max(max, solve(a, i, b)+1);
        }

        cache.put(100*a + 10000*b + 1000000*c, max);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(container(A, B, C));
    }

}
