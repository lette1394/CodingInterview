package Chap10;

public class Problem5 {


    int sparseSearch(String target, String[] strings) {
        return sparseSearch(target, strings, 0, strings.length-1);
    }

    int sparseSearch(String target, String[] strings, int left, int right) {
        int rightMid = (left + right) / 2 ;
        int leftMid = (left + right) / 2 ;
        int mid = (left + right) / 2 ;

        if (target.equals(strings[mid])) {
            return mid;
        }


        while(strings[rightMid].equals("") && rightMid <= right) {
            rightMid++;
        }
        if (strings[rightMid].equals(target)) {
            return rightMid;
        }

        while(strings[leftMid].equals("") && left <= leftMid) {
            leftMid--;
        }
        if (strings[leftMid].equals(target)) {
            return leftMid;
        }


        if (target.compareTo(strings[leftMid]) < 0) {
            return sparseSearch(target, strings, left, leftMid);
        }
        else if (target.compareTo(strings[rightMid]) > 0) {
            return sparseSearch(target, strings, rightMid + 1, right);
        }
        else {
            return sparseSearch(target, strings, leftMid + 1, rightMid);
        }
    }
}
