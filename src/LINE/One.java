package LINE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}

public class One {
    public static void main(String[] args) {
        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            while (st.hasMoreElements()) {
                String num = st.nextToken();
                System.out.println(num);
            }

            Map<Point, Integer> map = new HashMap<>();

            map.compute(new Point(2, 4), (a, b) -> {
                System.out.println(a.x + " " + a.y);

                return b;
            });

            for (Map.Entry<Point, Integer> e : map.entrySet()) {
                System.out.println(e.getKey());
            }
            List<Integer> list = new ArrayList<>();
            for (Integer integer : list) {
                System.out.println(integer);
            }

        } catch (Exception e) {
            int[][][] arr = new int[10][5][];

        }
    }

    public static int solution(String S) {

        String[] sentences = S.split("[.?!]");

        int ret = 0;
        for (String sentence : sentences) {
            String[] splited = sentence.trim().split(" ");

            int cnt = 0;
            for (String word : splited) {
                if (word.trim().isEmpty()) continue;
                cnt++;
            }

            ret = Math.max(ret, cnt);
        }

        return ret;
    }
}
