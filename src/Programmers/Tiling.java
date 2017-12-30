package Programmers;

public class Tiling {
    int[] cache = new int[5000];

    public int tilingTest(int n) {
        return tiling(n);
    }

    int tiling(int remain) {
        if (remain == 0) {
            return 0;
        }
        else if (remain == 1) {
            return 1;
        }
        else if (remain == 2) {
            return 2;
        }
        else {
            if (cache[remain] != 0) {
                return cache[remain];
            } else {
                cache[remain] = tiling(remain-1) + tiling(remain-2);
                return cache[remain] % 100000;
            }
        }
    }

    public static void main(String args[]) {
        Tiling tiling = new Tiling();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.print(tiling.tilingTest(400));
    }
}
