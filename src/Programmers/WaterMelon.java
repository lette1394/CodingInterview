package Programmers;

import java.lang.StringBuilder;

public class WaterMelon {
    public String watermelon(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n/2; i++) {
            if(i % 2 == 0)
                sb.append("수");

            if(i % 2 == 1)
                sb.append("박");
        }

        return sb.toString();
    }
}
