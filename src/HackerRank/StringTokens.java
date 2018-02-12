package HackerRank;

public class StringTokens {

    static void solve(String s) {
        String regex = "[!?.@_', ]";

        String[] strings = s.split(regex);
        String[] result = new String[strings.length];
        int index = 0;

        for (String string : strings) {
            if (string.isEmpty()) {
                continue;
            }
            result[index] = string;
            index++;
        }

        System.out.println(index);
        for (String str : result) {
            if (str != null) {
                System.out.println(str);
            }
        }
    }
}
