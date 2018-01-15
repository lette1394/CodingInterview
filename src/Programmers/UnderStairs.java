package Programmers;

import Chap16.Problem5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class UnderStairs {
    Logger logger = LoggerFactory.getLogger(Problem5.class);

    class Node {
        int x, y, acc;
        Node(int x, int y, int acc) {
            this.x = x;
            this.y = y;
            this.acc = acc;
        }
    }
    private int[][] grid;
    private int[][] cache;

    Stack<Node> stack = new Stack<>();

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    int count(int[][] grid) {
        this.grid = grid;
        this.cache = new int[500][500];

        for (int[] aCache : cache) {
            Arrays.fill(aCache, -1);
        }

        cache[grid.length-1][grid[0].length-1] = 1;

        return count(grid[0].length-1, grid.length-1);
    }

    private int count(int X, int Y) {
        int result = 0;
        stack.push(new Node(X, Y, 0));

        while (!stack.empty()) {
            Node node = stack.pop();
            int x = node.x;
            int y = node.y;

            logger.debug("(x, y) : " + node.x + ", " + node.y);


            if (cache[y][x] > 0) {
                result += cache[y][x];
                continue;
            }

            if (isArrived(x, y)) {
                result += 1;
                continue;
            }

            if (cache[y][x] == -1) {
                cache[y][x] = 0;
                int count = 0;

                for (int i = 0; i < 4; i++) {
                    int nx = dx[i] + x;
                    int ny = dy[i] + y;

                    if (isValid(nx, ny, grid[y][x])) {
                        stack.push(new Node(nx, ny, 0));
                        count++;
                    }
                }
                cache[y][x] = count;
            }
        }

        return result;
    }

    private boolean isValid(int x, int y, int currentValue) {
        return isUnderBoundary(x, y) && isToDownSide(x, y, currentValue);
    }

    private boolean isUnderBoundary(int x, int y) {
        return 0 <= x && x < grid[0].length && 0 <= y && y < grid.length;
    }

    private boolean isArrived(int x, int y) {
        return x == 0 && y == 0;
    }

    private boolean isToDownSide(int x, int y, int beforeValue) {
        return grid[y][x] > beforeValue;
    }

    int[][] parse() throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < col; j++) {
                result[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        UnderStairs u = new UnderStairs();
        int[][] grid = u.parse();

        System.out.println(u.count(grid));
    }
}
