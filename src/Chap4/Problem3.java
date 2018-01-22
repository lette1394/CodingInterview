package Chap4;

import java.util.LinkedList;
import java.util.List;

public class Problem3 {

    List<LinkedList<Node>> depthList;

    Problem3() {
        depthList = new LinkedList<>();
    }

    String DFS(Node root) {
        StringBuilder sb = new StringBuilder();

        DFSImpl(root, 0, sb);

        return sb.toString().trim();
    }

    void DFSImpl(Node current, int depth, StringBuilder sb) {
        sb.append(current.value);
        sb.append(" ");

        if (depthList.size() < depth+1) {
            depthList.add(new LinkedList<>());
        }

        depthList.get(depth).add(current);

        for (Node node : current.children) {
            if (node != null) {
                DFSImpl(node, depth+1, sb);
            }
        }
    }

    String ListToString() {
        StringBuilder root = new StringBuilder();

        for (LinkedList<Node> list : depthList) {
            StringBuilder sb = new StringBuilder();

            for (Node node : list) {
                sb.append(node.value);
                sb.append(" ");
            }

            root.append(sb);
            root.append("\n");
        }

        return root.toString().trim();
    }

}

class Node {
    Node[] children = new Node[2];
    int value;
    int depth;

    Node(int value) {
        this.value = value;
    }
}