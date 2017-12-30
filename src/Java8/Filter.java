package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "node", "mkyong", "test");
        List<String> result = getFilterOutput(lines, "mkyong");

        for (String temp : result) {
            System.out.println(temp);
        }

        List<String> result1 = lines.stream()
                .filter(line -> !"mkyong".equals(line))
                .collect(Collectors.toList());

        result1.forEach(System.out::println);


    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();

        for (String line : lines) {
            if (!filter.equals(line)) {
                result.add(line);
            }
        }

        return result;
    }
}
