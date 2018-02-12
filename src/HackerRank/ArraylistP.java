package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraylistP {
    private static List<List<Integer>> listContainer;
    private static Scanner sc;

    static public void parse() {
        sc = new Scanner(System.in);
        int queryNumber = sc.nextInt();

        listContainer = new ArrayList<>();
        for (int i = 0; i < queryNumber; i++) {
            int size = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                list.add(sc.nextInt());
            }
            listContainer.add(list);
        }
    }

    static public void printElements() {
        int e = sc.nextInt();

        while (sc.hasNext()) {
            int list = sc.nextInt();
            int index = sc.nextInt();
            System.out.println(getElements(list, index));
        }
    }

    static public String getElements(int list, int index) {
        int result;

        try {
            result = listContainer.get(list-1).get(index-1);
        } catch (IndexOutOfBoundsException e) {
            return "ERROR!";
        }

        return result+"";
    }

    static public void printList(List<List<Integer>> lists) {
        for (List<Integer> list : lists) {
            for (int i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
