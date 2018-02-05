package Chap13;

import java.util.List;

public class Problem1 {
    public static void main(String[] args) {

    }

}



class Higher {
    private final int a;

    private Higher() {
        a = 10;
    }

    static Higher getInstance() {
        return new Higher();
    }
}


