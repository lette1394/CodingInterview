package BOJ;

import java.io.*;
import java.util.*;

public class DrinkGrape {
    private static final Map<Integer, Long> map = new HashMap<>();

    static long solve(int[] amount) {
        if (amount == null || amount.length == 0) {
            return 0;
        }

        map.clear();

        return solve(amount, amount.length-1);
    }

    static long solve(int[] amount, int index) {

        if (map.containsKey(index)) {
            return map.get(index);
        }

        if (index < 0) {
            return 0;
        }
        if (index == 0) {
            return amount[0];
        }
        if (index == 1) {
            return amount[0] + amount[1];
        }

        long one = solve(amount, index-2) + amount[index];
        long two = solve(amount, index-3) + amount[index] + amount[index-1];
        long three = solve(amount, index-1);

        long result = Math.max(Math.max(one, two), three);
        map.put(index, result);

        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader out = new BufferedReader(reader);

        int n = Integer.parseInt(out.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            String line = out.readLine();
            arr[i] = Integer.parseInt(line);
        }

        System.out.println(solve(arr));
    }
}
