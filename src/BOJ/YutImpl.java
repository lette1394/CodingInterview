package BOJ;

import java.io.*;
import java.util.stream.Stream;

public class YutImpl {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String line = readLine();
            Yut result = sort(line);

            System.out.println(result.getValue());
        }
    }

    private static String readLine() {
        String result = "";

        try {
            result = in.readLine();
        } catch (Exception e) {
          e.printStackTrace();
        }

        return result;
    }

    private static Yut sort(String line) {
        if (line.equals("")) {
            return Yut.ERROR;
        }

        int sum = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).sum();

        return classifying(sum);
    }

    private static Yut classifying(int sum) {
        switch (sum) {
            case 0:
                return Yut.YUT;

            case 1:
                return Yut.GUL;

            case 2:
                return Yut.GAE;

            case 3:
                return Yut.DO;

            case 4:
                return Yut.MO;
        }

        return Yut.ERROR;
    }
}


enum Yut {
    DO("A"), GAE("B"), GUL("C"), YUT("D"), MO("E"), ERROR("");

    final private String ch;

    Yut(String ch) {
        this.ch = ch;
    }

    String getValue() {
        return ch;
    }
}