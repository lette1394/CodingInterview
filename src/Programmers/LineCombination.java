package Programmers;

import java.util.*;

class LineCombination {
    long[] cache = new long[5000];
    Queue<Integer> queue = new LinkedList<>();

    public int[] setAlign(int n, long k) {
        long back_k = fact(n) - k + 1;
        long acc = fact(n);
        int figure = n;

        for (int at = 1; at <= n; at++) {
            while (figure != 0) {
                if (acc == back_k || acc < back_k) {
                    break;
                }

                acc -= fact(n - at);
                figure--;
            }
            queue.offer(figure);
            figure = n;
        }

        int[] answer = new int[queue.size()];
        int i = 0;
        while(!queue.isEmpty()) {
            answer[i] = queue.poll();
            i++;
        }

        return answer;
    }

    long fact(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            if (cache[n] != 0) {
                return cache[n];
            }
            else {
                return cache[n] = fact(n-1) * n;
            }
        }
    }



    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        LineCombination lc = new LineCombination();
        System.out.println(Arrays.toString(lc.setAlign(3, 5)));
    }
}


