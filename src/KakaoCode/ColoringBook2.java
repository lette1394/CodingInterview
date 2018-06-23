package KakaoCode;

public class ColoringBook2 {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    int n, m;
    int[][] picture;
    boolean[][] visited;
    int result = 0;

    public void dfs(int x, int y) {
        result++;
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= n || nx < 0 || ny >= m || ny < 0)
                continue;

            if(picture[y][x] != picture[ny][nx] || visited[ny][nx])
                continue;

            dfs(nx, ny);
        }
    }

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        this.m = m;
        this.n = n;
        this.picture = picture;
        int[] answer = new int[2];
        visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(picture[i][j] != 0 && !visited[i][j]) {
                    numberOfArea++;
                    dfs(j, i);
                    maxSizeOfOneArea = Math.max(result, maxSizeOfOneArea);
                    result = 0;
                }
            }
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
