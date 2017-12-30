package Chap2;

import Chap2.resources.LinkedList;
import org.junit.Test;
import org.junit.Before;

public class SumOfList {
    LinkedList ll;

    @Before
    public void setUp() {
        ll = new LinkedList();
    }

    @Test
    public void test() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.append(7);
        l1.append(1);
        l1.append(6);
        l2.append(5);
        l2.append(9);
        l2.append(2);

        ll.sumOfLists(l1, l2);
        ll.printAllNode();
    }
}
