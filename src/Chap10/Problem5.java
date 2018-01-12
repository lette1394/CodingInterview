package Chap10;

public class Problem5 {


    int sparseSearch(String target, String[] strings, int left, int right) {
        int index = partition(target, strings, left, right);



        return index;
    }

    int partition(String target, String[] strings, int left, int right) {
        int mid = (left + right) / 2 ;

        while(strings[mid].equals("")) {
            mid++;
        }

        return target.compareTo(strings[mid]);
    }
}
