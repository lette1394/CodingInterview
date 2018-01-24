package Chap4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem3Answer {
    public void createLevelLinkedList(Node root, List<LinkedList<Node>> lists, int level) {
        if (root == null) {
            return ;
        }

        LinkedList<Node> list = null;
        if (lists.size() == level) {
            list = new LinkedList<>();
            lists.add(list);

        } else {
            list = lists.get(level);
        }
        list.add(root);
    }

    List<LinkedList<Node>> createLevelLinkedListBFS(Node root) {
        List<LinkedList<Node>> result = new ArrayList<>();

        LinkedList<Node> current = new LinkedList<>();

        if (root != null) {
            current.add(root);
        }

        //BFS 해법도 알아둘만 함!
        while (current.size() > 0) {
            result.add(current);
            LinkedList<Node> parents = current;
            current = new LinkedList<>();

            for (Node parent : parents) {
                if (parent.children[0] != null) {
                    current.add(parent.children[0]);
                }

                if (parent.children[1] != null) {
                    current.add(parent.children[1]);
                }
            }
        }

        return result;
    }

}
