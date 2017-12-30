package Chap1;

public class MinusOne {

    boolean isValid(String from, String to) {
        return oneEditAway(from, to);
    }


    boolean mine1(String from, String to) {
        if(from.length() - 1 != to.length()
                && from.length() + 1 != to.length()
                && from.length() != to.length()) {

            return false;
        }

        int[] array_1 = new int[128];

        for (char ch : from.toCharArray()) {
            array_1[ch]++;
        }

        for (char ch : to.toCharArray()) {
            array_1[ch]--;
        }

        int sum = 0;
        for (int i = 0; i < 128; i++) {
            if(array_1[i] <= -1) {
                sum += array_1[i];
            }
        }

        if (sum < -1)
            return false;

        return true;
    }

    boolean oneEditAway(String first, String second) {
        if(first.length() == second.length()) {
            return oneEditReplace(first, second);
        }
        else if(first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        }
        else if(first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }

        return false;
    }

    private boolean oneEditInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < second.length() && index1 < first.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean oneEditReplace(String first, String second) {
        boolean foundDifference = false;

        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != second.charAt(i)) {
                if(foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}





















