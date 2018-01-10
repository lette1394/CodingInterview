package Chap8;

public class Problem2 {
    int[][] grid;
    int rowMax, colMax;
    int[][] cache;

    void setGrid(int[][] grid) {
        this.grid = grid;
        rowMax = grid.length - 1;
        colMax = grid[0].length - 1;
        cache = new int[100][100];
    }

    int getCountOf(int[][] grid) {
        setGrid(grid);

        return countImpl(0, 0);
    }

    int countImpl(int x, int y) {

        if (isNotValid(x, y)) {
            return 0;
        }
        else if (isArrived(x, y)) {
            return 1;
        }
        else {
            if (cache[x][y] != 0) {
                return cache[x][y];
            }
            else {
                return cache[x][y] = countImpl(x + 1, y) + countImpl(x, y + 1);
            }
        }
    }

    boolean isNotValid(int x, int y) {
        if(isOutOfBound(x, y)) {
            return true;
        } else if(isBlocked(x, y)) {
            return true;
        }

        return false;
    }

    boolean isBlocked(int x, int y) {
        return (grid[x][y] == 1);
    }

    boolean isOutOfBound(int x, int y) {
        return (x > rowMax || y > colMax);
    }

    boolean isArrived(int x, int y) {
        return (x == rowMax && y == colMax);
    }

}
