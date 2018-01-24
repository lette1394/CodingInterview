package Chap4;

public class Problem8Answer {

    //1. 부모 노드에 대한 링크가 있는 경우
    TreeNode commonAncestor1(TreeNode p, TreeNode q) {
        int delta = depth(p) - depth(q);
        TreeNode first = delta > 0 ? q : p;
        TreeNode second = delta > 0 ? p : q;
        second = goUpBy(second, Math.abs(delta));

        while (first != second && first != null && second != null) {
            first = first.parent;
            second = second.parent;
        }

        return first == null || second == null ? null : first;

    }

    private TreeNode goUpBy(TreeNode node, int delta) {
        while (delta > 0 && node != null) {
            node = node.parent;
            delta--;
        }
        return node;
    }

    private int depth(TreeNode node) {
        int depth = 0;

        while (node != null) {
            node = node.parent;
            depth++;
        }
        return depth;
    }


    //////////////////////////////////////////////////////


    //2. 개선
    // 덮을 수 있는 노드인지 계산하기 (탐색 이용)

    TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!covers(root, p) || !covers(root, q)) {
            return null;
        } else if (covers(p, q)) {
            return p;
        } else if (covers(q, p)) {
            return q;
        }

        TreeNode sibiling = getSibling(p);
        TreeNode parent = p.parent;

        while (!covers(sibiling, q)) {
            sibiling = getSibling(parent);
            parent = parent.parent;
        }

        return parent;
    }

    private TreeNode getSibling(TreeNode node) {
        if (node == null || node.parent == null) {
            return null;
        }

        TreeNode parent = node.parent;

        return parent.left == node ? parent.right : parent.left;
    }

    private boolean covers(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;

        return covers(root.left, p) || covers(root.right, p);
    }

    ///////////////////////////////////////////////////////////////

    // 3. 부모 노드에 대한 링크가 없는 경우
    // 찾으려 하는 두 노드가 같은 쪽의 경로를 따라가도록 한다

    class Result {
        public TreeNode node;
        public boolean isAncestor;
        public Result(TreeNode n, boolean isAnc) {
            node = n;
            isAncestor = isAnc;
        }
    }

    TreeNode commonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        Result r = commonAncestorHelper(root, p, q);

        if (r.isAncestor) {
            return r.node;
        }
        return null;
    }

    Result commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return new Result(root, false);

        if (root == p && root == q) {
            return new Result(root, true);
        }

        Result rx = commonAncestorHelper(root.left, p, q);
        if (rx.isAncestor) { //공통 조상을 찾았다
            return rx;
        }

        Result ry = commonAncestorHelper(root.right, p, q);
        if (ry.isAncestor) { //공통 조상을 찾았다
            return ry;
        }

        if (rx.node != null && ry.node != null) { //p와 q가 서로 다른 부분 트리에서 발견되었다
            return new Result(root, true); // 현재 노드가 공통 조상
        }
        else if (root == p || root == q) {
            boolean isAncestor = rx.node != null || ry.node != null;
            return new Result(root, isAncestor);
        }
        else {
            return new Result(rx.node != null ? rx.node : ry.node, false);
        }
    }


}
