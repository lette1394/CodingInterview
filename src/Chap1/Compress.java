package Chap1;

import java.util.Vector;
import java.lang.StringBuilder;

public class Compress {
    public String compress(String source){
        return AnswerCompress(source);
    }

    String mine(String source) {
        if(source.isEmpty())
            return "";

        char[] split  = source.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char temp = split[0];

        for(char ch : split) {
            if (temp == ch) {
                index++;
            }
            else {
                sb.append(String.valueOf(temp));
                sb.append(index);
                index = 1;
            }
            temp = ch;
        }

        sb.append(temp);
        sb.append(index);

        String result = sb.toString();

        if(result.length() < source.length())
            return result;
        else
            return source;
    }

    String AnswerCompress(String str) {
        StringBuilder compressedString = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString.append(str.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressedString.length() < str.length() ? compressedString.toString() : str;
    }
}
