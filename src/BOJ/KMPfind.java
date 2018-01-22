package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMPfind {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        String input = buf.readLine();
        String pattern = buf.readLine();

        while (true) {

        }



    }

    int[] getDuplicateIndexAndLengthOfPattern(String pattern) {
        char[] list = pattern.toCharArray();
        int index = 0;
        int length = 0;

        for (int i = 0, j = i+1; i < list.length; i++) {
            if (j < list.length && list[i] == list[j]) {
                index = j;
            }
        }

        return new int[] {index, length};
    }
}
