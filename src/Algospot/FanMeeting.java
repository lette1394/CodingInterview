package Algospot;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class FanMeeting {
    public static void main(String[] args) {
        final InputStreamReader reader = new InputStreamReader(System.in);
        final BufferedReader in = new BufferedReader(reader);

        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int testCases = Integer.parseInt(st.nextToken());

            for (int t = 0; t < testCases; t++) {
                st = new StringTokenizer(in.readLine());
                List<Boolean> members = new ArrayList<>();
                for (char member : st.nextToken().toCharArray()) {
                    if (member == 'F') {
                        members.add(false);
                    } else {
                        members.add(true);
                    }
                }

                st = new StringTokenizer(in.readLine());
                List<Boolean> fans = new ArrayList<>();
                for (char fan : st.nextToken().toCharArray()) {
                    if (fan == 'F') {
                        fans.add(false);
                    } else {
                        fans.add(true);
                    }
                }

                System.out.println(solve(members, fans));
            }

        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.fillInStackTrace());
        }
    }

    private static int solve(List<Boolean> m, List<Boolean> f) {
        boolean[] members = new boolean[m.size()];
        boolean[] fans = new boolean[f.size()];

        for (int i = 0; i < members.length; i++) {
            members[i] = m.get(i);
        }

        for (int i = 0; i < fans.length; i++) {
            fans[i] = f.get(i);
        }

        return solve(members, fans);
    }

    private static int solve(boolean[] members, boolean[] fans) {
        boolean[] result = new boolean[members.length + fans.length - 1];

        for (int r = 0; r < result.length; r++) {
            boolean hug = false;
            for (int m = members.length-1, f = r; m >= 0; m--, f++) {
                if (f >= fans.length) {
                    break;
                }
                hug = hug || (members[m] && fans[f]);
            }
            result[r] = hug;
        }

        int sum = 0;
        for (int i = members.length-1; i < result.length-members.length+1; i++) {
            if (!result[i]) {
                sum++;
            }
        }

        return sum;
    }
}
