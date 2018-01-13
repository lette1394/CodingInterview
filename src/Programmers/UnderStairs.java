package Programmers;

import java.util.Scanner;
import java.util.Stack;

public class UnderStairs {
    class Node {
        int x, y, pre;
        Node(int x, int y, int pre) {
            this.x = x;
            this.y = y;
            this.pre = pre;
        }
    }

    int[][] grid;

    Stack<Node> stack = new Stack<>();

    int count(int[][] grid) {
        this.grid = grid;

        return count(0, 0, 999999);
    }

    int count(int X, int Y, int PRE) {
        int result = 0;
        Node current;
        stack.push(new Node(X, Y, PRE));

        while (!stack.empty()) {
            current = stack.pop();
            int x = current.x;
            int y = current.y;
            int pre = current.pre;

            if (!isDownSide(x, y, pre)) {
                continue;
            }

            if (isArrived(x, y)) {
                result += 1;
                continue;
            }

            if (isValid(x+1, y)) {
                stack.push(new Node(x+1, y, grid[y][x]));
            }
            if (isValid(x-1, y)) {
                stack.push(new Node(x-1, y, grid[y][x]));
            }
            if (isValid(x, y+1)) {
                stack.push(new Node(x, y+1, grid[y][x]));
            }
            if (isValid(x, y-1)) {
                stack.push(new Node(x, y-1, grid[y][x]));
            }
        }
        return result;
    }

    private boolean isValid(int x, int y) {
        return 0 <= x && x < grid[0].length && 0 <= y && y < grid.length;
    }

    private boolean isArrived(int x, int y) {
        return x == grid[0].length-1 && y == grid.length-1;
    }

    private boolean isDownSide(int x, int y, int pre) {
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
}
