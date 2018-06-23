package Algospot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boggle {
    private int[] dx = new int[] {0, 1, -1, 0, 1, -1, 1, -1};
    private int[] dy = new int[] {1, 0, 0, -1, 1, -1, -1, 1};
    private boolean[][][] fail;

    public static void main(String[] args) {
        new Boggle().parseAndSet();
    }

    private void parseAndSet() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);

        try {
            int testcase = Integer.parseInt(in.readLine());

            for (int i = 0; i < testcase; i++) {
                int SIZE = 5;
                char[][] board = new char[SIZE][SIZE];

                for (int y = 0; y < SIZE; y++) {
                    String st = in.readLine();
                    char[] line = st.toCharArray();

                    for (int x = 0; x < SIZE; x++) {
                        board[y][x] = line[x];
                    }
                }
                int wordNum = Integer.parseInt(in.readLine());
                String[] words = new String[wordNum];

                for (int j = 0; j < wordNum; j++) {
                    words[j] = in.readLine();
                }

                for (int k = 0; k < wordNum; k++) {
                    System.out.print(words[k] + " ");

                    String result = (solve(board, words[k].toCharArray()) ? "YES" : "NO");
                    System.out.println(result);
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean solve(char[][] board, char[] words) {
        boolean result;
        fail = new boolean[board.length][board[0].length][words.length+1];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                result = solve(board, words, i, j, 0);

                if (result) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean solve(char[][] board, char[] words, int y, int x, int index) {
        if (x < 0 || y < 0 || x >= board[0].length || y >= board.length) {
            return false;
        }

        if (fail[y][x][index]) {
            return false;
        }

        if (board[y][x] != words[index]) {
            return false;
        }

        if (index > words.length) {
            return false;
        }

        if (index == words.length-1) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (solve(board, words, ny, nx, index+1)) {
                fail[ny][nx][index+1] = false;
                return true;
            }
        }

        fail[y][x][index] = true;
        return false;
    }
}











