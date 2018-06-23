package Algospot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuadTree {
    public static void main(String[] args) {
        final InputStreamReader reader = new InputStreamReader(System.in);
        final BufferedReader in = new BufferedReader(reader);

        try {
            int testCases = Integer.parseInt(in.readLine());

            for (int t = 0; t < testCases; t++) {
                System.out.println(solve(in.readLine()));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String solve(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char ch : chars) {
            list.add(ch);
        }

        Iterator<Character> iter = list.iterator();

        return reverse(iter);
    }

    private static String reverse(Iterator<Character> iter) {
        char ch = iter.next();

        if (ch == 'b' || ch == 'w') {
            return String.valueOf(ch);
        }

        String upperLeft = reverse(iter);
        String upperRight = reverse(iter);
        String lowerLeft = reverse(iter);
        String lowerRight = reverse(iter);

        return "x" + lowerLeft + lowerRight + upperLeft + upperRight;
    }
}
