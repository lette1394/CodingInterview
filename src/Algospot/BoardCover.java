package Algospot;

import java.util.*;
import java.io.*;

public class BoardCover {
    private int[][][] shapes = new int[][][] {
            {{0, 0}, {0, 1}, {1, 0}},
            {{0, 0}, {0, 1}, {1, 1}},
            {{0, 0}, {1, 0}, {1, 1}},
            {{0, 0}, {1, 0}, {1, -1}},
    };

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            int testCases = Integer.parseInt(in.readLine().trim());

            for (int i = 0; i < testCases; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());

                char[][] board = new char[row][col];

                for (int y = 0; y < row; y++) {
                    board[y] = in.readLine().trim().toCharArray();
                }

                System.out.println(new BoardCover().solve(board, row, col));
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int solve(char[][] board, int row, int col) {

        return helper(board, 0);
    }

    private int helper(char[][] board, int index) {

        if (index == board.length * board[0].length) {
            return 1;
        }

        int x = index % board[0].length;
        int y = index / board[0].length;

        if (board[y][x] == '#') {
            return helper(board, index+1);
        }

        int count = 0;
        for (int type = 0; type < 4; type++) {
            if (isFit(board, y, x, type)) {
                setShapes(board, y, x, type);
                count += helper(board, index+1);
                unSetShapes(board, y, x, type);
            }
        }


        return count;
    }

    private boolean isFit(char[][] board, int y, int x, int type) {

        boolean fit = true;
        for (int j = 0; j < shapes[type].length; j++) {
            int[] indices = shapes[type][j];
            int ny = indices[0] + y;
            int nx = indices[1] + x;

            if (ny < 0 || nx < 0 || ny >= board.length || nx >= board[0].length) {
                fit = false;
                break;
            }
            if (board[ny][nx] == '#') {
                fit = false;
                break;
            }
        }
        return fit;
    }

    private void setShapes(char[][] board, int y, int x, int type) {
        int[][] indices = shapes[type];

        for (int[] index : indices) {
            int ny = index[0] + y;
            int nx = index[1] + x;

            board[ny][nx] = '#';
        }
    }

    private void unSetShapes(char[][] board, int y, int x, int type) {
        int[][] indices = shapes[type];

        for (int[] index : indices) {
            int ny = index[0] + y;
            int nx = index[1] + x;

            board[ny][nx] = '.';
        }
    }
}
