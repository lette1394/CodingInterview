package Chap1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class StudentMap {
    public HashMap<Integer, Student> buildMap(Student[] students) {

        HashMap<Integer, Student> map = new HashMap<>();

        for(Student s : students)
            map.put(s.getId(), s);

        return map;
    }

    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<>();

        sentence.addAll(Arrays.asList(words));

        for(String w : more)
            sentence.add(w);

        return sentence;
    }

    public String[] merge2(String[] words, String[] more) {
        ArrayList<String> array = new ArrayList<>();

        array.addAll(Arrays.asList(words));
        array.addAll(Arrays.asList(more));

        return array.toArray(new String[array.size()]);
    }

    public String joinWords(String[] words) {
        StringBuilder sb = new StringBuilder();

        for(String w : words) {
            sb.append(w);
            sb.append(", ");
        }
        return sb.toString();
    }

    public String joinWords2(String[] words) {
        return String.join(" ", words);
    }
}
