package HackerRank;

import java.util.*;

public class PasswordCracker {
    private static String wrong = "WRONG PASSWORD";
    private static List<String> answer = new LinkedList<>();
    private static Map<Integer, Boolean> cache = new HashMap<>();

    private static String passwordCracker(String[] pass, String password) {
        answer.clear();
        cache.clear();

        if (pass == null || pass.length == 0) {
            return wrong;
        }

        return impl(pass, password, 0) ? printAns(answer) : wrong;
    }

    private static String printAns(List<String> answer) {
        StringBuilder sb = new StringBuilder();

        for (int i = answer.size()-1; i >= 0; i--) {
            sb.append(answer.get(i));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    private static boolean impl(String[] dict, String password, int index) {
        if (index == password.length()) {
            return true;
        }

        if (cache.containsKey(index)) {
            return cache.get(index);
        }

        for (String word : dict) {
            if (!password.substring(index).startsWith(word)) continue;
            if (impl(dict, password, index+word.length())) {
                answer.add(word);
                cache.put(index, true);

                return true;
            }
        }
        cache.put(index, false);

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String[] pass = new String[n];
            for(int pass_i = 0; pass_i < n; pass_i++){
                pass[pass_i] = in.next();
            }
            String password = in.next();
            String result = passwordCracker(pass, password);
            System.out.println(result);
        }
        in.close();
    }

}

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int cnt = sc.nextInt();
            Set<String> dict = new HashSet<>();
            Map<String, Boolean> map = new HashMap<>();
            for(int j = 0; j < cnt; j++){
                dict.add(sc.next());
            }
            String s = sc.next();
            boolean res = dfs(s,dict,"",map);
            if (!res){
                System.out.println("WRONG PASSWORD");
            }
        }
    }

    private static boolean dfs(String s, Set<String> dict, String path, Map<String, Boolean> map){

        if (s == null || s.length() == 0) {
            System.out.println(path.trim());
            return true;
        }

        if (map.containsKey(s)) {
            return map.get(s);
        }

        for (String word : dict) {
            if (!s.startsWith(word)) continue;
            if (dfs(s.substring(word.length()), dict, path + word + " ", map)){
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);

        return false;
    }
}