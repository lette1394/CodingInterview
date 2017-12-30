package Chap1;

class RotateString {
    boolean isSubstring(String origin, String rotated) {
        return answer(origin, rotated);
    }

    boolean mine(String origin, String rotated) {
        char[] origins = origin.toCharArray();
        char[] rotateds = rotated.toCharArray();

        if (origin.isEmpty() && rotated.isEmpty())
            return true;

        if (origin.isEmpty() || rotated.isEmpty())
            return false;

        if (origin.length() != rotated.length())
            return false;

        for (int move = 0; move < origins.length; move++) {
            for (int i = move; i < origins.length + move; i++) {
                if (origins[i % origins.length] != rotateds[i - move]) {
                    break;
                }

                if((i == origins.length + move - 1)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean answer(String origin, String rotated) {

        if(origin.isEmpty() && rotated.isEmpty())
            return true;

        int len = origin.length();

        if (len == rotated.length()) {
            String double_origin = origin + origin;

            return isSub(double_origin, rotated);
        }

        return false;
    }

    boolean isSub(String origin, String rotated) {
        char[] longer = origin.toCharArray();
        char[] shorter = rotated.toCharArray();

        int index1 = 0, index2 = 0;
        while(index1 < origin.length() && index2 < rotated.length()) {
            if(longer[index1] != shorter[index2]) {
                index1++;
            }
            else {
                index1++;
                index2++;
            }
        }

        if (index2 == rotated.length())
            return true;
        else
            return false;
    }
}
