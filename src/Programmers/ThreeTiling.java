package Programmers;

class ThreeTiling {
    int[] cache2 = new int[5000];
    int[] cache = new int[5000];

    public int tiling(int n) {
        if (n % 2 == 1) {
            return 0;
        }
        return tilingTwoImp(n);
    }

    int tilingTwoImp(int remain) {
        if (remain < 0) {
            return 0;
        }
        else if (remain == 0) {
            return 0;
        }
        else if (remain == 2) {
            return 3;
        }
        else {
            if (cache2[remain] != 0) {
                return cache2[remain];
            } else {
                cache2[remain] = (3*tilingTwoImp(remain-2) + 2*tilingTwoImp(remain-4)) % 100000;
                return cache2[remain];
            }
        }
    }


    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ThreeTiling t = new ThreeTiling();
        System.out.println(t.tiling(718));
    }
}

