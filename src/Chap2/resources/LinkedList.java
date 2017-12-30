package Chap2.resources;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class LinkedList {
    public static final int DATA_RANGE = 5000;

    Logger logger = LoggerFactory.getLogger(LinkedList.class);

    Node head;
    Random random;

    public LinkedList() {
        random = new Random();
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            head.size = 1;
            return ;
        }
        head.appendToTail(data);
    }

    public void createRandomNodes(int size, int range) {
        for (int i = 0; i < size; i++) {
            append(random.nextInt(range));
        }
    }

    public int getNthData(int num) {
        if (head == null)
            return -1;

        return head.getNthData(num);
    }

    public void printAllNode() {
        logger.debug("-----------");
        head.printAllNodes();
    }

    public void deleteDup() {
        head.deleteDupWithoutHashSet();
    }

    public int getSize() {
        return head.size;
    }

    public int getBackOfKthValue(int k) {
        return head.getBackOfKth(k).data;
    }
    public int getBackOfKthValueANSWER(int k) { return head.printKthToLast(head, k);}

    public void deleteMiddleElement(int k) {
        head.deleteMiddleElement(k);
    }

    public void division(int x) {
        head = head.division(x);
    }

    public void sumOfLists(LinkedList l1, LinkedList l2) {
        int[] num = new int[100];
        int size = 0;

        for (int i = 0; i < l1.getSize(); i++) {
            num[i] = l1.getNthData(i) + l2.getNthData(i);
            size++;
        }

        for (int i = 0; i < size+1; i++) {
            int up = num[i] / 10;
            int remain = num[i] % 10;

            num[i] = remain;
            num[i+1] += up;
        }

        for (int i = 0; i < size+1; i++) {
            if (num[i] != 0) {
                this.append(num[i]);
            }
        }
    }

    class Index {
        public int value = 0;
    }

    Node kthToLast(Node head, int k) {
        Index idx = new Index();
        return kthToLast(head, k, idx);
    }

    Node kthToLast(Node head, int k, Index idx) {
        if (head == null) {
            return null;
        }
        Node node = kthToLast(head.next, k, idx);
        idx.value = idx.value + 1;

        if (idx.value == k) {
            return head;
        }
        return node;
    }

    Node kthToLastMine(Node node, int location, int index) {
        if (node == null) {
            System.out.println("more than Length");
            return null;
        }
        if (location == index) {
            return node;
        } else {
            return kthToLastMine(node.next, location, --index);
        }
    }

    public int kthToLast(int k) {
        return this.kthToLast(this.head, k, new Index()).data;
    }

    Node nthToLast(Node head, int k) {
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

}

class Node {
    Logger logger = LoggerFactory.getLogger(LinkedList.class);

    Node next = null;
    int data;
    int size;

    Node(int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
        size++;
    }

    Node deleteNode(Node head, int data) {
        Node n = head;

        if (n.data == data) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    int getNthData(int num) {
        Node n = this;
        int count = 0;

        while (count < num) {
            n = n.next;
            count++;
        }
        return n.data;
    }

    void printAllNodes() {
        Node n = this;

        logger.debug(String.valueOf(n.data));
        while (n.next != null) {
            n = n.next;
            logger.debug(String.valueOf(n.data));
        }
    }

    void deleteDup() {
        Node node = this;
        HashSet<Integer> set = new HashSet<>();

        set.add(node.data);
        while(node.next != null) {
            if (set.contains(node.next.data)) {
                node.next = node.next.next;
                size--;
            } else {
                set.add(node.next.data);
                node = node.next;
            }
        }
    }

    void deleteDupWithoutHashSet() {
        Node node = this;
        Node dup = this;

        while (node != null) {
            dup = node;

            while (dup.next != null) {
                if (node.data == dup.next.data) {
                    dup.next = dup.next.next;
                    size--;
                } else {
                    dup = dup.next;
                }
            }
            node = node.next;
        }
    }

    void deleteDupWithoutHashSetANSWER() {
        Node current = this;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                    size--;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    Node getBackOfKth(int k) {
        Node kth = this;
        Node iter = this;
        int count = 0;

        while (iter.next != null) {
            if (count == k) {
                kth = kth.next;
            }
            else {
                count++;
            }
            iter = iter.next;
        }

        return kth;
    }

    int printKthToLast(Node head, int k) {
        if (head == null) {
            return 0;
        }

        int index = printKthToLast(head.next, k) + 1;

        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }

    void deleteMiddleElement(int number) {
        Node iter = this;
        Node previous = this;
        int count = 0;

        while (iter.next != null) {
            if (count == number) {
                previous.next = iter.next;
                break;
            }
            previous = iter;
            iter = iter.next;
            count++;
        }
    }

    void deleteNodeANSWER(Node node) {
        Node nextNode = node.next;

        node.data = nextNode.data;
        node.next = nextNode.next;

    }

    Node division(int x) {
        Node iter = this;

        Node smaller = null;
        Node bigger = null;
        Node biggerStart = null;
        Node smallerStart = null;

        while (iter != null) {
            if (iter.data < x) {
                if (smaller == null) {
                    smaller = iter;
                    smallerStart = smaller;
                } else {
                    smaller.next = iter;
                    smaller = smaller.next;
                }
            } else {
                if (bigger == null) {
                    bigger = iter;
                    biggerStart = bigger;
                } else {
                    bigger.next = iter;
                    bigger = bigger.next;
                }
            }
            iter = iter.next;

        }
        bigger.next = null;
        smaller.next = biggerStart;

        return smallerStart;
    }

    Node divisionANSWER(Node node, int x) {
        Node beforeStart = null;
        Node afterStart = null;
        Node beforeEnd = null;
        Node afterEnd = null;

        while (node != null) {
            Node next = node.next;
            node.next = null;

            if (node.data < x) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }




}






