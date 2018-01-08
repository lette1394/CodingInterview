package Chap16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem12 {
    Scanner sc;
    Map<String, Integer> match;
    List<String> encodedString;
    int index = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Problem12 p = new Problem12();

        p.parseToMap();
        p.parseToMap();
        System.out.println(p.getEncodedXML());

    }

    Problem12() throws FileNotFoundException {
        this.sc = new Scanner(new FileInputStream("resources/test/Problem12.txt"));
        encodedString = new ArrayList<>();
        match = new HashMap<>();
    }

    String getOneLine() {
        if (sc.hasNext()) {
            return sc.nextLine();
        }
        return "";
    }

    String[] getTagsWithAttributes() {
        String line = getOneLine();
        line = line.replace("<", "");
        line = line.replace(">", "");
        line = line.replace("\"", "");

        return line.split(" ");
    }

    void parseToMap() {
        String[] tags = getTagsWithAttributes();
        setList(tags);

        for (int i = 1; i < tags.length; i++) {
            String[] attribute = tags[i].split("=");

            setList(attribute);
            encodedString.add(attribute[1]);
        }
        encodedString.add("0");
    }

    void setList(String[] attribute) {
        String newIndex = "";
        if(match.containsKey(attribute[0])) {
            newIndex = String.valueOf(match.get(attribute[0]));
            encodedString.add(newIndex);
        }
        else {
            match.put(attribute[0], ++index);
            encodedString.add(String.valueOf(index));
        }
    }


    String getEncodedXML() {
        StringBuilder sb = new StringBuilder();

        for (String s : encodedString) {
            sb.append(s);
            sb.append(" ");
        }

        return sb.toString();
    }

}
