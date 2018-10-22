package Practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(9);

        treeMap.put(10, "empty");
        treeMap.put(8, "eight");
        treeMap.put(1, "one");
        treeMap.put(2, "two");
        treeMap.put(5, "five");
        treeMap.put(7, "seven");
        treeMap.put(3, "three");

        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println(treeMap.ceilingKey(6));
        System.out.println(treeMap.floorKey(6));
        System.out.println(treeMap.higherKey(7));
        System.out.println(treeMap.lowerKey(8));
    }

}
