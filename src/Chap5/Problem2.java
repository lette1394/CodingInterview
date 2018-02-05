package Chap5;

public class Problem2 {
    public String solve(double v) {
        StringBuilder sb = new StringBuilder();
        String result = null;

        while (v != 0.000 && sb.length() <= 200) {
            v *= 2;
            if (v >= 1) {
                sb.append("1");
                v -= 1;
            } else if (v < 1) {
                sb.append("0");
            }
        }

        System.out.println(sb.toString());

        if (sb.length() > 32) {
            result = "ERROR";
        } else {
            result = sb.toString();
        }

        return result;
    }
}

//5번문제 -> 비트의 마지막 1을 0으로 바꾸는 코드
//5번문제 -> n이 2의 거듭제곱인지 확인하는 함수