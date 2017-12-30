package Programmers;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

    /*
     * Description :
     * Time complexity :
     * Space complexity :
     */
    public boolean match(String pattern, String s) {
        int p_idx = pattern.length()-1;
        int s_idx = s.length()-1;

        char[] regex = pattern.toCharArray();
        char[] str = s.toCharArray();

        while (p_idx != regex.length && s_idx != str.length) {
            if (regex[p_idx] != str[s_idx]) {
                return false;
            }

            if (regex[p_idx] == '?') {
                p_idx++;
                s_idx++;

                continue;
            }

            if (regex[p_idx] == '*') {
                while (regex[p_idx+1] != str[s_idx]) {
                    s_idx++;
                }

                continue;
            }

            p_idx++;
            s_idx++;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        try (Scanner scan = new Scanner(System.in)) {
            int TC = Integer.parseInt(scan.nextLine());
            for (int t = 0; t < TC; t++) {
                String[] strs = scan.nextLine().split(" ");
                System.out.println(main.match(strs[0], strs[1]) ? "O" : "X");
            }
        }
    }
}

