package Chap2;

import Chap2.resources.LinkedList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteDupTest {
    Logger logger = LoggerFactory.getLogger(LinkedList.class);

    LinkedList ll;

    boolean isDuplicated(LinkedList list) {
        boolean[] bools = new boolean[list.DATA_RANGE];

        logger.debug(String.valueOf("Size : " + list.getSize()));
        for (int i = 0; i < list.getSize(); i++) {

            if (bools[list.getNthData(i)]) {
                return true;
            }
            bools[list.getNthData(i)] = true;
        }

        return false;
    }

    @Before
    public void setUp() {
        ll = new LinkedList();

    }

    @Test
    public void dupTestAlwaysFalse() {
        ll.createRandomNodes(100, 10);
        ll.printAllNode();
        assertEquals(true, isDuplicated(ll));

        ll.deleteDup();
        ll.printAllNode();
        assertEquals(false, isDuplicated(ll));
    }

    @Test
    public void one() {
        ll.append(100);
        ll.deleteDup();
        assertEquals(false, isDuplicated(ll));
    }

    @Test
    public void randoms() {
        ll.createRandomNodes(10000, 4000);
        ll.deleteDup();
        assertEquals(false, isDuplicated(ll));
    }

    @Test
    public void getNthDataTest() {
        ll.append(0);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        assertEquals(4, ll.getNthData(4));
        assertEquals(1, ll.getNthData(1));
        assertEquals(2, ll.getNthData(2));
        assertEquals(0, ll.getNthData(0));

        ll.printAllNode();
        assertEquals(false, isDuplicated(ll));
    }


}
