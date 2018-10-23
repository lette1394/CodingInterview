package Practice;

import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        queue.add(2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        String hello = "helloworld!";
        List<Boolean> mylist = new ArrayList<>(50);
        Collections.fill(mylist, false);

        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(9193);
        System.out.println(s.size() + "size");

        mylist.get(1);

        Collections.binarySearch(mylist, false);

        for (boolean b : mylist) {
            System.out.println(b);
        }

        Queue<Integer> queue1 = new ArrayDeque<>();
    }
}
