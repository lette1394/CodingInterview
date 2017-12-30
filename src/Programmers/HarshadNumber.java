package Programmers;
import java.util.ArrayList;
import java.util.List;

public class HarshadNumber{
    public boolean isHarshad(int num){
        if (num % Integer.toString(num).chars()
                .map(x -> x - '0')
                .sum() == 0) {
            return true;
        }

        return false;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(180));
    }
}