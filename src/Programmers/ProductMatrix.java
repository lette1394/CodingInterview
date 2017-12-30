package Programmers;

import java.util.Arrays;

class ProductMatrix {
    public int[][] productMatrix(int[][] A, int[][] B) {
        int[][] answer = new int[A.length][B[0].length];

        for (int k = 0; k < A.length; k++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int i = 0; i < A[0].length; i++) {
                    answer[k][j] += A[k][i] * B[i][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductMatrix c = new ProductMatrix();
        int[][] a = { { 1, 2 },
                      { 2, 3 } };

        int[][] b = { { 3, 4 },
                      { 5, 6 } };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("행렬의 곱셈 : " + Arrays.deepToString(c.productMatrix(a, b)));
    }
}

