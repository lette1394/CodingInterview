package BOJ;

import java.io.*;
import java.util.Arrays;


public class Queue {
    private int defaultSize = 100;
    private int[] queue = new int[defaultSize];
    private int front = 0;
    private int back = 0;

    void parseSTDIN() {
        try {
            InputStream in = new BufferedInputStream(System.in);
            Reader reader = new InputStreamReader(in);
            BufferedReader buf = new BufferedReader(reader);

            int order = Integer.parseInt(buf.readLine());

            for (int i = 0; i < order; i++) {
                String line = buf.readLine();

                switch (line.split(" ")[0]) {
                    case "push":
                        this.push(Integer.parseInt(line.split(" ")[1]));
                        continue;

                    case "pop":
                        this.pop();
                        continue;

                    case "front":
                        this.front();
                        continue;

                    case "back":
                        this.back();
                        continue;

                    case "size":
                        this.size();
                        continue;

                    case "empty":
                        this.empty();
                        continue;

                    default:
                        throw new RuntimeException("Illegal");
                }
            }
        }
        catch (Exception e) {
            e.getMessage();
        }
    }

    void push(int value) {
        queue[back++] = value;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front++];
    }

    void size() {
        System.out.println(back - front);
    }

    void front() {
        if (isEmpty()) {
            System.out.println("-1");
        }
        else {
            System.out.println(queue[front]);
        }
    }

    void back() {
        if (isEmpty()) {
            System.out.println("-1");
        }
        else {
            System.out.println(queue[back-1]);
        }
    }

    void empty() {
        if (isEmpty()) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private boolean isEmpty() {
        return front == back;
    }

    private boolean isFull() {
        return front - 1 == back;
    }

}
