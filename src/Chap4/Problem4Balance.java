package Chap4;


public class Problem4Balance {

    boolean solve(Chap4.Node root) {
        StringBuilder sb = new StringBuilder();

        setLeaves(root);
        setParent(root);

        if (isAnyEmptyChildren(root.children)) {
            return true;
        }

        if (root.children[0].depth - root.children[1].depth <= 1) {
            return true;
        }

        return false;
    }

    private boolean isAnyEmptyChildren(Node[] children) {
        return children[0] == null || children[1] == null;
    }

    void setLeaves(Node current) {
        if (isEmptyChildren(current.children)) {
            current.depth = 1;
            return ;
        }

        for (Node node : current.children) {
            if (node != null) {
                setLeaves(node);
            }
        }
    }

    void setParent(Node current) {
        if (isEmptyChildren(current.children)) {
            return ;
        }

        int depth = -1;

        for (Node node : current.children) {
            if (node != null) {
                setParent(node);
                depth = node.depth;
            }
        }

        current.depth = depth;
    }

    private boolean isEmptyChildren(Node[] children) {
        return children[0] == null && children[1] == null;
    }

}
