package HackerRank;

import java.util.*;

public class StoneDivisionRevisited {

    private static Map<Long, Long> cache = new HashMap<>();

    static long stoneDivision(long size, long[] divider) {
        cache.clear();
        return impl(size, divider);
    }

    static long impl(long size, long[] querySet) {
        if (size == 0 || size == 1) {
            return 0;
        }

        if (cache.containsKey(size)) {
            return cache.get(size);
        }

        long max = 0;
        for (long query : querySet) {
            long sum;
            if (size % query != 0 || size == query) {
                continue;
            }

            long number = size / query;
            sum = impl(query, querySet) * number;
            sum += 1;

            max = Math.max(sum, max);
        }

        cache.put(size, max);
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long n = in.nextLong();
            int m = in.nextInt();
            long[] s = new long[m];
            for(int s_i = 0; s_i < m; s_i++){
                s[s_i] = in.nextLong();
            }
            long result = stoneDivision(n, s);
            System.out.println(result);
        }
        in.close();
    }
}
