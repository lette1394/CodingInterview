package Programmers;

class StringExercise {
    String getMiddle(String word) {
        int length = word.length();

        if(length == 0)
            return word;

        if(length % 2 == 0)
            return word.substring(length/2-1, length/2+1);

        if(length % 2 == 1)
            return word.substring(length/2, length/2+1);

        return "";
    }
}