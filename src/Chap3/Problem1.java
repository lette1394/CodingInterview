package Chap3;

import java.util.Arrays;

public class Problem1 {
    private static final int DEFAULT_SIZE = 10;
    private Elements[] elements;
    private int index;

    Problem1() {
         elements = new Elements[DEFAULT_SIZE];
         index = 0;
    }

    public void push(int data, Number number) {
        if (isNotCapable()) {
            expandSize();
        }

        elements[index++] = new Elements(data, number);
    }

    public int pop(Number number) {
        int iter = index;
        Elements result = null;

        for (int i = elements.length-1; i > 0; i--) {
            result = elements[i];

            if (result == null) {
                continue;
            }
            if (result.number == number) {
                iter = i;
                break;
            }
        }
        elements[iter] = null;

        assert result != null;

        return result.data;
    }

    public int peek(Number number) {
        int iter = index;
        Elements result = elements[--iter];

        while (result.number != number && iter > 0) {
            result = elements[--iter];
        }

        return result.data;
    }

    public boolean isEmpty(Number number) {
        int iter = index;
        Elements result = elements[iter];

        while (result.number != number && iter > 0) {
            result = elements[--iter];
        }

        return result == null;
    }

    private boolean isNotCapable() {
        int maxLength = elements.length-1;
        return index == maxLength;
    }

    private void expandSize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    private class Elements {
        Number number;
        int data;

        Elements(int data, Number number) {
            this.data = data;
            this.number = number;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }
}

enum Number {
    FIRST, SECOND, THIRD
}