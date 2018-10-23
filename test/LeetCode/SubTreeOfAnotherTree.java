package LeetCode;

public class SubTreeOfAnotherTree {

    //      Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    class MySolution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;

            return (s.val == t.val
                    && isSubtreeCheck(s.left, t.left)
                    && isSubtreeCheck(s.right, t.right))
                    || isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        private boolean isSubtreeCheck(TreeNode s, TreeNode t) {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;

            return (s.val == t.val
                    && isSubtreeCheck(s.left, t.left)
                    && isSubtreeCheck(s.right, t.right));
        }
    }


    // this solution remove duplicated calculate
    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;
            if (isSame(s, t)) return true;

            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        private boolean isSame(TreeNode s, TreeNode t) {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;

            return (s.val == t.val)
                    && isSame(s.left, t.left)
                    && isSame(s.right, t.right);
        }
    }
}
