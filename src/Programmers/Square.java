package Programmers;


class Square {
    class Point {
        int x;
        int y;
        int index;
        int maxIndex;

        public Point(char[][] board) {
            this.x = 0;
            this.y = 0;
            this.index = 0;
            this.maxIndex = board.length * board[0].length - 1;
        }
    }

    public int findLargestSquare(char[][] board) {
        int maxStage = 0;
        int stage = 0;
        Point idx = new Point(board);

        while(nextIdx(idx, board)) {
            while (checkStage(idx, stage, board)) {
                stage++;
            }
            maxStage = Math.max(stage, maxStage);
            stage = 0;
        }
        return maxStage * maxStage;
    }

    boolean nextIdx(Point idx, char[][] board) {
        if (idx.index == idx.maxIndex) {
            return false;
        }

        idx.index++;
        idx.y = idx.index % board.length;
        idx.x = idx.index / board.length;

        return true;
    }

    boolean checkStage(Point idx, int stage, char[][] board) {

        //정사각형 여부 검사
        if(maxX(board) < idx.x + stage || maxY(board) < idx.y + stage) {
            return false;
        }

        //x 검사
        for (int i = 0; i <= stage; i++) {
            if(board[idx.y + stage][idx.x + i] != 'O') {
                return false;
            }
        }

        //y 검사
        for (int i = 0; i <= stage; i++) {
            if(board[idx.y + i][idx.x + stage] != 'O') {
                return false;
            }
        }

        return true;
    }

    int maxY(char[][] board) {
        return board.length - 1;
    }

    int maxX(char[][] board) {
        return board[0].length - 1;
    }


    public static void main(String[] args) {
        Square test = new Square();

        char[][] board ={
                {'X','O','O','O','X'},
                {'X','O','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}