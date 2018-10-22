package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int[] ints = list.stream().mapToInt(a -> a).toArray();
    }
}
