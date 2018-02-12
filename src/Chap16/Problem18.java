package Chap16;

import java.util.ArrayList;
import java.util.List;

public class Problem18 {


    public boolean solve(String string, String pattern) {
        if (pattern.isEmpty()) {
            return false;
        }

        List<String> list = findRepeatedWords(string);
        list = splitMaximum(list);

        System.out.println(list);
        String patternA = generatePattern(list, "a", "b");
        String patternB = generatePattern(list, "b", "a");

        return patternA.contains(pattern) || patternB.contains(pattern);
    }


    List<String> splitMaximum(List<String> list) {
        List<String> result = new ArrayList<>();

        String small = list.get(0);
        for (String str : list) {
            if (str.length() < small.length()) {
                small = str;
            }
        }


        for (String str : list) {
            int index = str.indexOf(small);
            if (index != -1) {
                result.add(str.substring(index, index+small.length()));
                if (index+small.length() < str.length()) {
                    result.add(str.substring(index+small.length()));
                }
            } else {
                result.add(str);
            }
        }

        return result;
    }

    public List<String> findRepeatedWords(String str) {
        char[] chars = str.toCharArray();
        List<String> result = new ArrayList<>();

        int baseIndex = 0;
        int compareIndex = baseIndex+1;
        char baseChar = chars[baseIndex];

        for (int k = 0; k < chars.length; k++) {
            for (; compareIndex < chars.length;) {

                if (baseChar == chars[compareIndex]) {
                    break;
                } else {
                    compareIndex++;
                }
            }
            result.add(str.substring(baseIndex, compareIndex));
            baseIndex = compareIndex;
            compareIndex = baseIndex+1;

            if (compareIndex >= chars.length) {
                break;
            }
        }
        return result;
    }

    String generatePattern(List<String> list, String first, String second) {
        StringBuilder sb = new StringBuilder();

        String base = list.get(0);
        for (String str : list) {
            if (str.isEmpty()) {
                continue;
            }
            if (base.equals(str)) {
                sb.append(first);
            } else {
                sb.append(second);
            }
        }
        return sb.toString();
    }
}
