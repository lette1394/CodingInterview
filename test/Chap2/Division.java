package Chap2;

import Chap2.resources.LinkedList;
import org.junit.Test;
import org.junit.Before;

public class Division {
    LinkedList ll;

    @Before
    public void setUP() {
        ll = new LinkedList();
    }

    @Test
    public void test1() {
        ll.append(100);
        ll.append(3);
        ll.append(5);
        ll.append(72);
        ll.append(8);
        ll.append(5);
        ll.append(10);
        ll.append(2);
        ll.append(1);
        ll.append(2);
        ll.append(9);
        ll.append(66);

        ll.division(5);
        ll.printAllNode();
    }

}
