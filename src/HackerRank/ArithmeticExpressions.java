package HackerRank;

import java.util.*;

public class ArithmeticExpressions {
    private static int[] numbers;
    private static String s;
    private static int[][] cache = new int[100001][250];

    private static void arithmeticExpressions(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return ;
        }

        ArithmeticExpressions.numbers = numbers;
        s = "";
        init(cache);
        if (impl(1, numbers[0])) {
            System.out.println(numbers[0] + s);
        }
    }

    private static void init(int[][] cache) {
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
    }

    private static boolean impl(int index, int acc) {
        if (index == numbers.length) {
            return acc % 101 == 0;
        }

        if (cache[index][acc+100] != -1) {
            return cache[index][acc+100] == 1;
        }

        if (impl(index+1, (acc*numbers[index])%101)) {
            s = "*" + numbers[index] + s;
            cache[index+1][(acc*numbers[index])%101 + 100] = 1;
            return true;
        }

        if (impl(index+1, (acc-numbers[index])%101)) {
            s = "-" + numbers[index] + s;
            cache[index+1][(acc-numbers[index])%101 + 100] = 1;
            return true;
        }

        if (impl(index+1, (acc+numbers[index])%101)) {
            s = "+" + numbers[index] + s;
            cache[index+1][(acc+numbers[index])%101 + 100] = 1;
            return true;
        }

        cache[index][acc + 100] = 0;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        arithmeticExpressions(arr);
        in.close();
    }
}
