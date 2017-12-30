package Chap1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;

public class IsPermutation {
    Logger logger = LoggerFactory.getLogger(IsPermutation.class);

    boolean isPermuation(String str1, String str2) {
        return solution(str1, str2);
    }

    boolean solution(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] str1_array = str1.toCharArray();
        for (char ch : str1_array) {
            letters[ch]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = (int)str2.charAt(i);
            letters[c]--;

            if(letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    boolean mine2(String str1, String str2) {
        int[] array_1 = new int[128];
        int[] array_2 = new int[128];

        if (str1.length() != str2.length())
            return false;

        for (char ch : str1.toCharArray()) {
            array_1[ch]++;
        }

        for (char ch : str2.toCharArray()) {
            array_2[ch]++;
        }

        for (int i = 0; i < 128; i++) {
           if (array_1[i] != array_2[i])
               return false;
        }

        return true;
    }

    boolean mine1(String str1, String str2) {
        header(str1, str2);

        HashMap<Character, Character> map = new HashMap<>();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (char ch : str1.toCharArray()) {
            map.put(ch, ch);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsValue(ch)) {
                return false;
            }
        }

        footer();
        return true;
    }

    private void header(String str1, String str2) {
        logger.debug("");
        logger.debug("START!!--------");
        logger.debug("str1 : " + str1);
        logger.debug("str2 : " + str2);
    }

    private void footer() {
        logger.debug("END!!----------");
    }
}
