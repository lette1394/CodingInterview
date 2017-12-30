package Programmers;

import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = new int[n];

        int remain = s % n;
        int val = s / n;

        if(val * n + remain != s) {
            return new int[] {-1};
        }

        else {
            for (int i = 0; i < n; i++) {
                answer[i] = val;
            }

            int i = 0;
            while (remain != 0) {
                answer[i]++;
                i++;
                remain--;
            }
        }

        Arrays.sort(answer);

        return answer;
    }



    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}
