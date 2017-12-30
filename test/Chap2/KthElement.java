package Chap2;

import static org.junit.Assert.*;

import Chap2.resources.LinkedList;
import org.junit.Test;
import org.junit.Before;

public class KthElement {
    LinkedList ll;

    @Before
    public void setUp() {
        ll = new LinkedList();

    }

    @Test
    public void test1() {
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        assertEquals(5, ll.getBackOfKthValue(0));
        assertEquals(3, ll.getBackOfKthValue(2));
        assertEquals(2, ll.getBackOfKthValue(3));


    }
}
