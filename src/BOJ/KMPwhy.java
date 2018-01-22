package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMPwhy {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);

        String line = buf.readLine();

        StringBuilder sb = new StringBuilder();
        for (String s : line.split("-")) {
            sb.append(s.split("")[0]);
        }

        System.out.println(sb.toString().trim());
    }
}
