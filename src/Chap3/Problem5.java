package Chap3;

import java.util.Arrays;

public class Problem5 {
    private final static int DEFAUT_SIZE = 10;
    private int[] stack = new int[DEFAUT_SIZE];
    private int index = -1;
    private int popIndex = -1;

    public void push(int data) {
        stack[++index] = data;

        Arrays.sort(stack, 0, index+1);
        System.out.println(Arrays.toString(stack));
    }

    public int pop() {
        return stack[++popIndex];
    }

    public int peek() {
        return stack[index];
    }

    public boolean isEmpty() {
        return index == -1;
    }
}
