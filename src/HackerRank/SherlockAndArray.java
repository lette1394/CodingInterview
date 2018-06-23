package HackerRank;

import java.util.*;

public class SherlockAndArray {
    static String solve(int[] a){
        int total = sum(a);

        int left = 0;
        int right = total;
        int before = 0;
        for (int e : a) {
            left += before;
            right -= e;

            before = e;
            if (left == right) {
                return "YES";
            }
        }

        return "NO";
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }

}
