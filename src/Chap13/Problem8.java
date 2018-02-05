package Chap13;

import java.util.*;
import java.util.stream.Collectors;

public class Problem8 {
    public static void main(String[] args) {
        List list = Arrays.asList(11, 2, 5, 123, 23, 4, 40, 19, 512, 234, 90, 33, 532, 121, 24, 0, 3);

        System.out.println(getRandomSubset(list));
    }

    static List getRandomSubset(List<Integer> list) {
        Random random = new Random();

        return list.stream().filter(a -> new Random().nextInt()%2 == 0).collect(Collectors.toList());
    }
}

