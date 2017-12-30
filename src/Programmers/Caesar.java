package Programmers;

public class Caesar {

    String caesar(String str, int move) {

        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {

            //소문자일 때
            if(Character.isLowerCase(ch)) {
                ch = (char)((ch - 'a' + move) % 26 + 'a');
                sb.append(ch);
                continue;
            }

            //대문자일 때
            if(Character.isUpperCase(ch)) {
                ch = (char)((ch - 'A' + move) % 26 + 'A');
                sb.append(ch);
                continue;
            }

            //공백
            sb.append(ch);
        }

        return new String(sb);
    }


}
