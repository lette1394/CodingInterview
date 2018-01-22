package Chap4;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem3Test {

    Problem3 p = new Problem3();

    Node getExampleTree() {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node.children[0] = node1;
        node.children[1] = node2;

        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.children[0] = node3;
        node1.children[1] = node4;

        node4.children[0] = node5;

        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node5.children[0] = node6;
        node5.children[1] = node7;

        node2.children[1] = node8;
        node2.children[0] = node9;

        node9.children[0] = node10;

        return node;
    }

    @Test
    public void dfs() {
        Node node = getExampleTree();

        assertEquals("0 1 3 4 5 6 7 2 9 10 8", p.DFS(node, 0));

    }

    @Test
    public void printLinkedNode() {
        Node node = getExampleTree();
        p.DFS(node, 0);

        assertEquals("0 \n" +
                "1 2 \n" +
                "3 4 9 8 \n" +
                "5 10 \n" +
                "6 7", p.ListToString());
    }
}
