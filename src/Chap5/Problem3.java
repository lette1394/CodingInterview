package Chap5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem3 {
    public int solve(String s) {
        String binary = Integer.toBinaryString(Integer.parseInt(s));
        List<Integer> list = new ArrayList<>();

        System.out.println(binary);

        int beforeIndex = -1;
        int afterIndex = binary.indexOf("0");
        list.add(afterIndex-beforeIndex-1);

        while (true) {
            beforeIndex = afterIndex;
            afterIndex = binary.indexOf("0", afterIndex+1);

            if (afterIndex == -1) {
                list.add(binary.length()-beforeIndex-1);
                break;
            } else {
                list.add(afterIndex-beforeIndex-1);
            }
        }

        int max = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;
        for (Integer i : list) {
            b = a;
            a = i;

            max = Math.max(a + b, max);
        }

        return max+1;
    }
}
