package Chap4;

import java.util.LinkedList;
import java.util.List;

public class Problem3 {

    List<LinkedList<Node>> depthList;

    Problem3() {
        depthList = new LinkedList<>();

        for (LinkedList<Node> list : depthList) {
            list = new LinkedList<>();
        }
    }

    String DFS(Node root, int depth) {
        StringBuilder sb = new StringBuilder();

        DFSImpl(root, 0, sb);

        return sb.toString().trim();
    }

    void DFSImpl(Node current, int depth, StringBuilder sb) {
        if (current.visited) {
            return ;
        }

        sb.append(current.value);
        sb.append(" ");

        for (Node node : current.children) {
            if (node != null) {
                DFSImpl(node, sb);
            }
        }
    }
}

class Node {
    Node[] children = new Node[2];
    int value;
    boolean visited;

    Node(int value) {
        this.value = value;
    }
}