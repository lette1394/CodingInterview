package HackerRank;

public class StringReverse {
    public String solve(String str) {

        char[] chars = str.toCharArray();

        int front = 0;
        int back = chars.length-1;

        while (front < back) {
            if (chars[front] != chars[back]) {
                return "No";
            }

            front++;
            back--;
        }

        return "Yes";
    }
}
