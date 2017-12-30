package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseInt {
    public int reverseInt(int n){
        char[] list = String.valueOf(n).toCharArray();
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();

        for (char ch : list) {
            sb.append(ch);
        }
        sb.reverse();

        return Integer.parseInt(sb.toString());
    }

    public int reverseIntStream(int n) {
        StringBuilder sb = new StringBuilder();
        Integer.toString(n).chars().sorted().forEach(i -> sb.append(Character.valueOf((char)i)));
        return Integer.parseInt(sb.reverse().toString());
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}