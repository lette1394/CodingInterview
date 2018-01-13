package Chap8;

import java.util.Stack;

public class Problem2 {
    int[][] grid;
    int rowMax, colMax;
    int[][] cache;
    Stack<Coords> s = new Stack<>();

    class Coords {
        int x, y;

        Coords(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    void setGrid(int[][] grid) {
        this.grid = grid;
        rowMax = grid.length - 1;
        colMax = grid[0].length - 1;
    }

    int getCountOf(int[][] grid) {
        setGrid(grid);

        return countImplIter(0, 0);
    }

    int countImpl(int x, int y) {

        if (isNotValid(x, y)) {
            return 0;
        }
        else if (isArrived(x, y)) {
            return 1;
        }
        else {
            return countImpl(x + 1, y) + countImpl(x, y + 1);
        }
    }

    int countImplIter(int x, int y) {
        int result = 0;
        Coords temp;

        s.push(new Coords(x, y));

        while (!s.empty()) {
            temp = s.pop();

            if (isNotValid(temp.x, temp.y)) {
                continue;
            }
            else if (isArrived(temp.x, temp.y)){
                result += 1;
                continue;
            }
            else {
                s.push(new Coords(temp.x+1, temp.y));
                s.push(new Coords(temp.x, temp.y+1));
            }
        }

        return result;
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
