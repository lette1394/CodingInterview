package Chap3;

import java.util.EmptyStackException;

public class Problem2 {
    private static class StackNode {
        private int data;
        private StackNode next;
        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;
    private int minValue = Integer.MAX_VALUE;

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int item = top.data;
        top = top.next;
        return item;
    }

    public void push(int item) {
        minValue = Math.min(item, minValue);
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }

    public int peek() {
        if (top == null) throw  new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int min() {
        return minValue;
    }
}


