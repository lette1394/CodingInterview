package Chap1;

public class Problem7Answer {
    /*
    for 0 to n
    temp = top[i]
    top[i] = left[i]
    left[i] = bottom[i]
    bottom[i] = right[i]
    right[i] = temp
    */

    boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length - 1;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                //왼쪽 -> 위쪽
                matrix[first][i] = matrix[last-offset][first];

                //아래쪽 -> 왼쪽
                matrix[last-offset][first] = matrix[last][last-offset];

                //오른쪽 -> 아래쪽
                matrix[last][last-offset] = matrix[i][last];

                //위쪽 -> 오른쪽
                matrix[i][last] = top;
            }
        }

        return true;
    }
}
