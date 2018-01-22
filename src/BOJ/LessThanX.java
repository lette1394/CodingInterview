package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LessThanX {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String lineOne = readLine();

        int N = Integer.parseInt(lineOne.split(" ")[0]);
        int X = Integer.parseInt(lineOne.split(" ")[1]);

        String lineTwo = readLine();
        String[] lineTwoSplited = lineTwo.split(" ");
        for (String s : lineTwoSplited) {
            if (Integer.parseInt(s) < X) {
                System.out.println(s);
            }
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
}
