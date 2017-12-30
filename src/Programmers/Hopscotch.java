package Programmers;


class Hopscotch {

    int hopscotch(int[][] board, int size) {

        return hopscotch(board, 0, -1);
    }


    int hopscotch(int[][] board, int y, int preY) {

        if (y >= board.length) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            if (i != preY) {
                max = Integer.max(hopscotch(board, y+1, i) + board[y][i], max);
            }
        }

        return max;
    }



    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = {{4, 5, 1, 9}, {5, 2, 1, 7}, {1, 5, 2, 10}, {8, 7, 2, 9}, {5, 9, 5, 10}, {3, 5, 5, 4}, {6, 10, 1, 6}, {7, 6, 1, 4}, {3, 2, 9, 5}, {10, 5, 8, 3}};
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 10));
    }

}
