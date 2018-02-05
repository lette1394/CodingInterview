package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static String super_reduced_string(String s){
        String empty = "Empty String";

        if (s.isEmpty()) {
            return empty;
        }

        StringBuilder sb = new StringBuilder(s);
        String result = impl(sb);

        return result;
    }

    private static String impl(StringBuilder sb) {
        Pair pair = getPair(sb.toString());

        if (!pair.exist) {
            if (sb.length() == 0) {
                return "Empty String";
            } else {
                return sb.toString();
            }

        } else {
            assert(pair.index >= 0);
            sb.deleteCharAt(pair.index);
            sb.deleteCharAt(pair.index);

            return impl(sb);
        }
    }

    static Pair getPair(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length-1; i++) {
            char one = chars[i];
            char two = chars[i+1];

            if (one == two) {
                return new Pair(i, true);
            }
        }

        return new Pair(-1, false);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

class Pair {
    int index;
    boolean exist;

    Pair(int index, boolean exist) {
        this.index = index;
        this.exist = exist;
    }
}

