package Chap2;

import Chap2.resources.LinkedList;
import org.junit.Test;
import org.junit.Before;

public class DeleteKthElement {
    LinkedList ll;

    @Before
    public void setUp() {
        ll = new LinkedList();

    }

    @Test
    public void test1() {
        ll.append(0);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.append(7);
        ll.append(8);

        ll.deleteMiddleElement(6);
        ll.printAllNode();

        ll.deleteMiddleElement(3);
        ll.printAllNode();

        ll.deleteMiddleElement(2);
        ll.printAllNode();

        ll.getBackOfKthValueANSWER(6);
    }
}
