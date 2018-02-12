package HackerRank;

import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        int[] aChars = new int[26];
        int[] bChars = new int[26];

        for (char ch : a.toCharArray()) {
            if (ch < 'a') {
                ch = (char) (ch-'A'+'a');
            }
            aChars[ch-'a']++;
        }

        for (char ch : b.toCharArray()) {
            if (ch < 'a') {
                ch = (char) (ch-'A'+'a');
            }
            bChars[ch-'a']++;
        }

        return Arrays.equals(aChars, bChars);
    }
}
