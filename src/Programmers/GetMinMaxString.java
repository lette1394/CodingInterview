package Programmers;

import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] strList = str.split(" ");

        int[] list = new int[strList.length];

        for (int i = 0; i < strList.length; i++) {
            list[i] = Integer.parseInt(strList[i]);
        }

        Arrays.sort(list);

        return new String(list[0] + " " + list[list.length-1]);
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}