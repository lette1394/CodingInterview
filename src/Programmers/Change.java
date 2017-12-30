package Programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Change {
    int[] coins;
    int[][] cache = new int[5000][5000];

    class State {
        int amount;
        int idx;

        State(int amount, int idx) {
            this.amount = amount;
            this.idx = idx;
        }
    }

    public int change(int total, int[] coins) {
        this.coins = coins;
        return recur_count(total);
    }

    int recur_count(int amount) {
        return recur_count(amount, 0);
    }

    int recur_count(int amount, int idx) {
        if (amount == 0) {
            return 1;
        }
        else if (amount < 0 || idx >= coins.length) {
            return 0;
        }
        else {
            if(cache[amount][idx] != 0) {
                return cache[amount][idx];
            }
            else {
                int temp = recur_count(amount - coins[idx], idx) + recur_count(amount, idx + 1);
                cache[amount][idx] = temp;
                return temp;
            }

        }
    }

    int count(int amount) {
        return count(amount, 0);
    }

    int count(int amount, int idx) {
        int result = 0;
        int _amount = amount;
        int _idx = idx;
        Stack<State> stack = new Stack<>();

        do {
            if (_amount == 0) {
                result += 1;
            }
            else if (_amount < 0 || _idx >= coins.length) {

            }
            else {
                stack.push(new State(_amount - coins[_idx], _idx));
                stack.push(new State(_amount, _idx + 1));
            }

            if (stack.empty()) {
                break;
            }

            State temp = stack.pop();
            _amount = temp.amount;
            _idx = temp.idx;

        } while(true);

        return result;
    }


    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Change c = new Change();
        int[] coins = { 9, 19, 39, 27, 33, 42, 40, 21, 13, 47 };
        System.out.println(c.change(1000, coins));
    }
}

