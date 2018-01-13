package Programmers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class UnderStairs {
    class Node {
        int x, y, pre, result;
        Node(int x, int y, int pre) {
            this.x = x;
            this.y = y;
            this.pre = pre;
        }
    }

    int[][] grid;
    int[][] cache;
    Stack<Node> stack = new Stack<>();

    int count(int[][] grid) {
        this.grid = grid;
        this.cache = new int[grid.length][grid[0].length];
        for (int i = 0; i < cache.length; i++) {
            Arrays.fill(cache[i], -1);
        }
        return count(0, 0, 999999);
    }

    int count(int X, int Y, int PRE) {
        int result = 0;
        Node currentNode;
        stack.push(new Node(X, Y, PRE));

        while (!stack.empty()) {
            currentNode = stack.pop();
            int x = currentNode.x;
            int y = currentNode.y;
            int currentValue = grid[y][x];

            if (isArrived(x, y)) {
                result += 1;
                continue;
            }

            if (isValid(x+1, y, currentValue)) {
                stack.push(new Node(x+1, y, currentValue));
            }
            if (isValid(x-1, y, currentValue)) {
                stack.push(new Node(x-1, y, currentValue));
            }
            if (isValid(x, y+1, currentValue)) {
                stack.push(new Node(x, y+1, currentValue));
            }
            if (isValid(x, y-1, currentValue)) {
                stack.push(new Node(x, y-1, currentValue));
            }
        }
        return result;
    }

    private boolean isValid(int x, int y, int pre) {
        return isUnderBoundary(x, y) && toDownSide(x, y, pre);
    }

    private boolean isUnderBoundary(int x, int y) {
        return 0 <= x && x < grid[0].length && 0 <= y && y < grid.length;
    }

    private boolean isArrived(int x, int y) {
        return x == grid[0].length-1 && y == grid.length-1;
    }

    private boolean toDownSide(int x, int y, int pre) {
        return grid[y][x] < pre;
    }

    int[][] parse() {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = sc.nextInt();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UnderStairs u = new UnderStairs();
        int[][] grid = u.parse();

        System.out.println(u.count(grid));
    }
}
