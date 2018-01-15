package Chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem4 {

    int[][] grid;
    boolean[] processed;
    StringBuilder sb = new StringBuilder();
    Queue<Integer> queue = new ArrayDeque<>();

    public void setGrid() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        StringTokenizer token = null;
        try {
            token = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int size = token.countTokens();

        grid = new int[size][size];
        processed = new boolean[size];

        try {
            while (reader.ready()) {
                token = new StringTokenizer(reader.readLine());
                while (token.hasMoreTokens()) {
                    int from = token.nextToken().toCharArray()[0] - 'a';
                    int to = token.nextToken().toCharArray()[0] - 'a';
                    grid[from][to] = 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getOrder() {
        setGrid();

        for (int i = 0; i < 3; i++) {
            addClearNode();
            appendNode();
        }

        return sb.toString();
    }

    private void appendNode() {
        while (!queue.isEmpty()) {

            int current = queue.poll();

            processed[current] = true;

            sb.append((char)(current + 'a'));
            sb.append(" ");

            setMyLineZero(current);
        }
    }

    private void addClearNode() {
        for (int i = 0; i < grid.length; i++) {
            if (columnIsZero(i) && !isProcessed(i)) {
                queue.add(i);
            }
        }
    }

    private boolean isProcessed(int i) {
        return !processed[i];
    }

    private boolean columnIsZero(int col) {

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] != 0) {
                return false;
            }
        }

        return true;
    }


    public void setMyLineZero(int row) {
        for (int i = 0; i < grid.length; i++) {
            grid[row][i] = 0;
        }
    }
}
