package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;

public class ReverseStr {
    public String reverseStr(String str){

        return Stream
                .of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public String reverse(String str) {
        char[] sol = str.toCharArray();
        Arrays.parallelSort(sol);

        return new StringBuilder(new String(sol)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println(rs.reverseStr("Zbcdefg") );
        System.out.println(rs.reverseStr("fedcba") );
        System.out.println(rs.reverse("Zbcdefg") );
    }
}
