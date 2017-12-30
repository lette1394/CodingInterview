package Chap1;

class RefactorSpace {
    String refactor(String str, int size) {
        return UsingPrimitive(str.toCharArray(), size);
    }

    String UsingAPI(String str) {
        String[] split = str.trim().split(" ");

        return String.join("%20", split);
    }

    String UsingPrimitive(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0, blank = 0;

        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                blank++;
            }
            else {
                break;
            }
        }

        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        spaceCount = spaceCount - blank;
        index = trueLength + spaceCount * 2;
        char[] buf = new char[index];

        if (trueLength < buf.length)
            buf[trueLength] = '\0';

        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                buf[index - 1] = '0';
                buf[index - 2] = '2';
                buf[index - 3] = '%';
                index = index - 3;
            }
            else {
                buf[index - 1] = str[i];
                index--;
            }
        }

        return String.valueOf(buf);
    }


}
