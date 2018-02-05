package Chap3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Problem3 {
    private final static int DEFAULT_SIZE = 3;
    private final static int LIST_SIZE = 1;
    private int[][] stackList = new int[LIST_SIZE][DEFAULT_SIZE];
    private int index = 0;
    private int offset = 0;

    public void push(int data) {
        if (isFull()) {
            if (isListFull()) {
                expandListSize();
            }
            expandSize();
        }
        if (offset == DEFAULT_SIZE) {
            index++;
            offset = 0;
        }
        stackList[index][offset++] = data;
        System.out.println(Arrays.deepToString(stackList));

    }

    public int pop() {
        if (index == 0 && offset == 0) throw new EmptyStackException();
        if (offset == 0) {
            index--;
            offset = DEFAULT_SIZE;
        }

        return stackList[index][--offset];
    }

    public int peek() {
        if (index == 0 && offset == 0) throw new EmptyStackException();

        return stackList[index][offset-1];
    }

    public boolean isEmpty() {
        return index == 0 && offset == 0;
    }

    private void expandSize() {
        offset = 0;
        index++;

        stackList[index] = new int[DEFAULT_SIZE];
    }

    private boolean isFull() {
        return offset == stackList[index].length;
    }

    private boolean isListFull() {
        return index == stackList.length-1;
    }

    private void expandListSize() {
        stackList = Arrays.copyOf(stackList, stackList.length * 2);
    }
}


