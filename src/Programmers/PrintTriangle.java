package Programmers;

import java.lang.StringBuilder;

public class PrintTriangle {
    public String printTriangle(int num){
        StringBuilder ref = new StringBuilder();
        StringBuilder line = new StringBuilder();

        for(int i = 0; i < num; i++) {
            line.append("*");
            ref.append(line);
            ref.append("\n");
        }

        return ref.deleteCharAt(ref.length()-1).toString();
    }
}