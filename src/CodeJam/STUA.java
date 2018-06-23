package CodeJam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class STUA {
    private static int shootCount;
    private static int chargeCount;
    private static int shield;

    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());

        int testCases = Integer.parseInt(st.nextToken());

        for (int t = 1; t <= testCases; t++) {
            st = new StringTokenizer(in.readLine());

            int shield = Integer.parseInt(st.nextToken());
            String query = st.nextToken();

            int result = solve(shield, query);
            System.out.print("Case #" + t + ": ");
            System.out.println(result == -1 ? "IMPOSSIBLE" : result);
        }

    }

    private static int solve(int _shield, String query) {
        shootCount = setCount(query, 'S');
        chargeCount = setCount(query, 'C');
        shield = _shield;

        if (shootCount > _shield) return -1;

        return solve(query.toCharArray());
    }

    private static int solve(char[] query) {
        int count = 0;

        while (true) {
            if (computeDamage(query) <= shield) break;

            moveRightestShoot(query);
            count++;
        }

        return count;
    }

    private static void moveRightestShoot(char[] query) {
        int index = -1;
        index = findShoot(query);
        index = adjustIndex(index, query);

        if (index == 0 || index == -1) return ;

        char temp = query[index-1];
        query[index-1] = query[index];
        query[index] = temp;
    }

    private static int adjustIndex(int _index, char[] query) {
        int index = _index;
        if (index == 0) return index;

        while (index > 0 && query[index-1] == 'S') {
            index--;
        }

        return index;
    }

    private static int findShoot(char[] query) {
        for (int i = query.length-1; i >= 0; i--) {
            if (query[i] == 'S') {
                return i;
            }
        }

        return -1;
    }

    private static int computeDamage(char[] query) {
        int sum = 0;
        int currentDamage = 1;

        for (char ch : query) {
            if (ch == 'C') currentDamage *= 2;
            else if (ch == 'S') sum += currentDamage;
        }

        return sum;
    }

    private static int setCount(String shootCount, char mode) {
        int count = 0;

        for (char ch : shootCount.toCharArray()) {
            if (ch == mode) count++;
        }

        return count;
    }
}
