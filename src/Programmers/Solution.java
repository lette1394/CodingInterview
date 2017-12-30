package Programmers;

import java.util.Arrays;

public class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int[][] map = new int[picture.length][picture[0].length];
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                map[i][j] = search(i, j, picture);
            }
        }

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if(map[i][j] != 0) {
                    answer[0]++;
                    answer[1] = Integer.max(answer[1], map[i][j]);
                }
            }
        }

        System.out.println(Arrays.deepToString(map));
        return answer;
    }

    int search(int y, int x, int[][] picture) {
        int CurrentColor = picture[y][x];
        picture[y][x] = -1;

        if (CurrentColor == 0 || CurrentColor == -1){
            return 0;
        }

        int sum = 1;

        if (x != 0 && CurrentColor == picture[y][x-1]) {
            sum += search(y, x-1, picture);
        }

        if (y != 0 && CurrentColor == picture[y-1][x]) {
            sum += search(y-1, x, picture);
        }

        if (x != picture[0].length-1 && CurrentColor == picture[y][x+1]) {
            sum += search(y, x+1, picture);
        }

        if (y != picture.length-1 && CurrentColor == picture[y+1][x]) {
            sum += search(y+1, x, picture);
        }

        return sum;
    }



    public static void main(String[] args) {
        int[][] pic1 = {
                {0, 1, 1},
                {0, 1, 0}
        };
        int[][] pic2 = {
                {5, 1, 1, 0},
                {1, 1, 2, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 3},
                {0, 1, 3, 3}};

        int[][] pic3 = {
                {5, 1, 1, 0, 8, 8, 8},
                {1, 1, 2, 0, 8, 8, 8},
                {8, 8, 0, 1, 6, 8, 6},
                {0, 8, 8, 1, 4, 8, 4},
                {0, 0, 8, 3, 4, 8, 4},
                {0, 1, 8, 8, 8, 8, 6}};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(6, 4, pic1)));
        System.out.println(Arrays.toString(solution.solution(6, 4, pic2)));
        System.out.println(Arrays.toString(solution.solution(6, 4, pic3)));
    }

}









