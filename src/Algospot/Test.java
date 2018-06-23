package Algospot;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] numbers = new int[] {
                0, 1, 2, 3, 4, 5
        };

        permutation(numbers, new ArrayList<>(), 2);

    }

    private static void permutation(int[] numbers, List<Integer> picked, int toPick) {
        if (toPick == 0) {
            print(picked);
            return ;
        }

        int smallest = picked.isEmpty() ? 0 : picked.get(picked.size()-1)+1;

        for (int i = smallest; i < numbers.length; i++) {
            picked.add(i);
            permutation(numbers, picked, toPick-1);
            picked.remove(picked.size()-1);
        }
    }

    private static void print(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
