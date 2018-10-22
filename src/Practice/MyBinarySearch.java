package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyBinarySearch {
    private static List<Integer> solve(List<Integer> list) {
        int[] save = new int[list.size()];
        int len = 0;

        save[0] = list.get(0);
        len++;
        for (int num : list) {
            int idx = Arrays.binarySearch(save, 0, len, num);

            if (idx < 0) {
                idx = -(idx + 1);
            }

            save[idx] = num;
            if (idx == len) len++;
        }

        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            ret.add(save[i]);
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        List<Integer> list = new ArrayList<>();

        for (String num : numbers) {
            list.add(Integer.parseInt(num));
        }

        List<Integer> ret = solve(list);

        ret.forEach((num) -> System.out.print(num + " "));
    }
}
