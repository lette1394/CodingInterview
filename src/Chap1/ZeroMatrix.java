package Chap1;

import java.util.ArrayList;

public class ZeroMatrix {
    int[][] setZero(int[][] matrix) {
        return new Solution().setZeros(matrix);
    }


}

class Solution {
    int[][] setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                nullifyRow(matrix, i);
            }
        }

        for (int i = 0; i < col.length; i++) {
            if (col[i]) {
                nullifyCol(matrix, i);
            }
        }

        return matrix;
    }

    void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    void nullifyCol(int[][] matrix, int col) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][col] = 0;
        }
    }
}

class MySolution {
    int[][] Solution(int[][] matrix) {
        Index index = getIndex(matrix);

        while(!index.isFinish()) {
            for (int x = 0; x < index.MAX_ROW; x++) {
                matrix[index.getY()][x] = 0;
            }
            for (int y = 0; y < index.MAX_COL; y++) {
                matrix[y][index.getX()] = 0;
            }

            index.moveToNextIndex();
        }
        return matrix;
    }

    Index getIndex(int[][] matrix) {
        Index index = new Index();
        index.MAX_COL = matrix.length;
        index.MAX_ROW = matrix[0].length;

        for (int y = 0; y < index.MAX_COL; y++) {
            for (int x = 0; x < index.MAX_ROW; x++) {
                if(matrix[y][x] == 0) {
                    index.add(new Pair(x, y));
                }
            }
        }

        return index;
    }

    class Index {
        ArrayList<Pair> list;

        int MAX_ROW;
        int MAX_COL;
        int iterCount = 0;

        Index() {
            list = new ArrayList<>();
        }

        boolean isFinish() {
            if (iterCount == list.size())
                return true;
            else
                return false;
        }

        void add(Pair pair) {
            list.add(pair);
        }

        int getY() {
            return list.get(iterCount).y;
        }

        int getX() {
            return list.get(iterCount).x;
        }

        void moveToNextIndex() {
            iterCount++;
        }
    }

    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

