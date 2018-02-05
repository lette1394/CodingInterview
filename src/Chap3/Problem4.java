package Chap3;

public class Problem4 {
    Problem3 start = new Problem3();
    Problem3 end = new Problem3();

    public void push(int data) {
        start.push(data);
    }

    public int pop() {
        if (end.isEmpty()) {
            while (!start.isEmpty()) {
                end.push(start.pop());
            }
        }

        return end.pop();
    }

    public int peek() {
        if (end.isEmpty()) {
            while (!start.isEmpty()) {
                end.push(start.pop());
            }
        }

        return end.peek();
    }

    public boolean isEmpty() {
        return start.isEmpty() && end.isEmpty();
    }
}
