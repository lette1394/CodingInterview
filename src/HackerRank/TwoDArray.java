package HackerRank;

public class TwoDArray {

    static public void solve(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr.length-2; j++) {
                max = Math.max(max, getSumOfHourglass(arr, i, j));
            }
        }

        System.out.println(max);
    }

    static private int getSumOfHourglass(int[][] arr, int x, int y) {
        int result = 0;

        result += arr[y][x];
        result += arr[y][x+1];
        result += arr[y][x+2];

        result += arr[y+1][x+1];

        result += arr[y+2][x];
        result += arr[y+2][x+1];
        result += arr[y+2][x+2];

        return result;
    }
}
