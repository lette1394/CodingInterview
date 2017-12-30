package Chap1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;


//문자열을 받아서 중복된 문자가 있으면 true, 없으면 false
//추가적인 자료구조를 활용하지 않는 방법도 생각해보자

public class NoDup {
    Logger logger = LoggerFactory.getLogger(NoDup.class);

    public boolean isDuplicated(String string) {
        return !isUniqueCharsbit(string);
    }

    private boolean withBuffer(String string) {
        char[] array = string.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
                logger.debug(array[i] + " " + array[j]);
            }
        }

        return false;
    }

    private boolean withoutAnything(String string) {

        return hasChar(string);
    }

    private boolean hasChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            logger.debug(String.valueOf(string.charAt(i)));

            if(hasChar(string.charAt(i), string.substring(i+1, string.length())))
                return true;
        }

        return false;
    }

    private boolean hasChar(char ch, String string) {
        if(string.length() == 0)
            return false;

        for (char one : string.toCharArray()) {
            if(ch == one)
                return true;
        }

        return hasChar(string.charAt(0), string.substring(1, string.length()));
    }

    private boolean withDataStructure(String string) {
        HashSet<Character> hash = new HashSet<>();

        for (char ch : string.toCharArray()) {
            if(hash.contains(ch)) {
                return true;
            }

            hash.add(ch);
        }

        return false;
    }

    private boolean withClass(String string) {
        DupHash dupHash = new DupHash();

        for (char ch : string.toCharArray())
            dupHash.processChar(ch);

        return dupHash.getDuplicate();
    }

    boolean isUniqueChars(String str) {
        if (str.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if(char_set[val])
                return false;

            char_set[val] = true;
        }
        return true;
    }

    boolean isUniqueCharsbit(String str) {
        int checker = 0;

        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';

            if((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }

        return true;
    }
}

// 꾸미다 짓다

class DupHash {
    private HashSet<Character> hash;
    private boolean duplicated;

    DupHash() {
        hash = new HashSet<>();
        duplicated = false;
    }

    void processChar(char ch) {
        setDuplicate(ch);
        addChar(ch);
    }

    boolean getDuplicate() {
        return duplicated;
    }

    private void setDuplicate(char ch) {
        if(hash.contains(ch)) {
            duplicated = true;
        }
    }

    private void addChar(char ch) {
        hash.add(ch);
    }
}