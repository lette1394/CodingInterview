package Chap16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Problem12 {
    Scanner sc;

    Problem12() throws FileNotFoundException {
        this.sc = new Scanner(new FileInputStream("resources/test/Problem12.txt"));
    }

    String getOneLine() throws IOException {
        if (sc.hasNext()) {
            return sc.nextLine();
        }
        return "";
    }


}
