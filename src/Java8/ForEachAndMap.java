package Java8;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ForEachAndMap {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Items : " + entry.getKey() + ", Count : " + entry.getValue());
        }

        System.out.println("-------------");

        items.forEach((k, v) -> System.out.println("Items : " + k + ", Count : " + v));

        System.out.println("-------------");

        items.forEach((k, v) -> {
            System.out.println("Item : " + k + ", Count " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });

        System.out.println("-------------");

        List<String> items1 = new ArrayList<>();
        items1.add("A");
        items1.add("B");
        items1.add("C");
        items1.add("D");
        items1.add("E");

        for (String item : items1) {
            System.out.println(item);
        }

        System.out.println("-------------");
        items1.forEach(System.out::println);

        System.out.println("-------------");

        items1.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println(item);
            }
        });

        System.out.println("-------------");

        items1.stream()
                .filter(s -> s.contains("B"))
                .forEach(System.out::println);


    }


}
