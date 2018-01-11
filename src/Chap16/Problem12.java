package Chap16;

import java.io.*;
import java.util.*;

public class Problem12 {
    Reader reader;
    Map<String, Integer> match;
    List<String> encodedString;
    int index = 1;

    Problem12() throws FileNotFoundException {
        reader = new InputStreamReader(new FileInputStream("resources/test/Problem12.txt"));
        encodedString = new ArrayList<>();
        match = new HashMap<>();
    }

    public String readElement() {
        StringBuilder sb = new StringBuilder();
        try {
            char ch = getOneChar();

            while (ch != '<') {
                ch = getOneChar();
            }

            while(ch != '>') {
                ch = getOneChar();
                sb.append(ch);
            }

        }
        catch(EOFException e) {
            return "EOF";
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    char getOneChar() throws EOFException {
        try {
            if (reader.ready()) {
                return (char)reader.read();
            }
        }

        catch (IOException e) {
            e.getStackTrace();
        }

        throw new EOFException();
    }

    public String parseOneLine() {
        String string = removeQuotes(readElement());
        String[] oneElement = string.split(" ");

        int encodedTag = getMapValue(oneElement[0]);
        addToEncodedString(encodedTag);

        if (hasAttributes(oneElement)) {
            for (int i = 1; i < oneElement.length; i++) {
                String attr = getAttribute(oneElement[i]);
                int encoded = getMapValue(attr);
                addToEncodedString(encoded);

                String value = getValue(oneElement[i]);
                addToEncodedString(value);
            }
        }

        return printXML();
    }

    private void addToEncodedString(Object encoded) {
        encodedString.add(String.valueOf(encoded));
    }

    private String getValue(String splited) {
        return splited.split("=")[1];
    }

    boolean hasAttributes(String[] splited) {
        return splited.length > 1;
    }

    int getMapValue(String key) {
        if (match.containsKey(key)) {
            int encoded = match.get(key);
            return encoded;
        }
        else {
            match.put(key, index);
            return index++;
        }
    }

    String getAttribute(String splited) {
        return splited.split("=")[0];
    }

    String printXML() {
        StringBuilder sb = new StringBuilder();
        for (String s : encodedString) {
            sb.append(s);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    String removeQuotes(String str) {
        return str.replace("\"", "");
    }
}
