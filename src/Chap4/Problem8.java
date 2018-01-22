package Chap4;

public class Problem8 {
    Node node1, node2;

    Node solve(Node root, Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;

        if (node1.isDecendantOf(root.children[0])) {

        }

        if (node2.isDecendantOf(root.children[1])) {

        }

        return new Node(1);
    }

    class Node {
        Node[] children;
        int value;

        Node(int value) {
            this.children = new Node[2];
            this.value = value;
        }

        boolean isDecendantOf(Node parent) {
            Node left = parent.children[0];
            Node right = parent.children[1];
            boolean result = false;

            if (left != null && left.value == this.value) {
                return true;
            }

            if (right != null && right.value == this.value) {
                return true;
            }

            if (left != null) {
                result |= isDecendantOf(left);
            }

            if (right != null) {
                result |= isDecendantOf(right);
            }

            return result;
        }
    }
}
