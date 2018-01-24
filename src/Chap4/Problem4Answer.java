package Chap4;

import java.util.Map;

public class Problem4Answer {
    int getHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int heightDiff = getHeight(root.left) - getHeight(root.right);

        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    int checkHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }

        //유효 검사를 null로 다 넘기자
        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;

        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}


class TreeNode {
    TreeNode left, right;
    int value;
    public TreeNode parent;

    TreeNode(int value) {
        this.value = value;
    }
}