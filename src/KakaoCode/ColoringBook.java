package KakaoCode;

import java.util.*;

public class ColoringBook {

    int[][] picture;
    boolean[][] visited;

    private int search(int x, int y, int pre) {
        if (x < 0 || x >= picture[0].length || y < 0 || y >= picture.length) {
            return 0;
        }

        if (picture[y][x] != pre || visited[y][x]) {
            return 0;
        }

        visited[y][x] = true;

        int count = 1;
        count += search(x+1, y, pre);
        count += search(x-1, y, pre);
        count += search(x, y+1, pre);
        count += search(x, y-1, pre);

        return count;
    }


    public int[] solution(int m, int n, int[][] picture) {
        int number = 0;
        int max = 0;
        this.picture = picture;
        this.visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 0 || visited[i][j]) {
                    continue;
                }

                number++;
                max = Math.max(max, search(j, i, picture[i][j]));
            }
        }

        int[] answer = new int[2];
        answer[0] = number;
        answer[1] = max;

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] picture = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                picture[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(new ColoringBook().solution(m, n, picture)));
    }

}
