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

    public String parseXML() {
        String string = removeQuotes(readElement());
        String[] oneElement = string.split(" ");

        if (hasAttributes(oneElement)) {
            addToEncodedString(oneElement[0]);

            for (int i = 1; i < oneElement.length-1; i++) {
                String attr = getAttribute(oneElement[i]);
                addToEncodedString(attr);

                String value = getValue(oneElement[i]);
                addToEncodedString(value);
            }
        }
        else {
            addToEncodedString(oneElement[0]);
        }

        return printXML();
    }

    private String getValue(String splited) {
        return splited.split("=")[1];
    }

    boolean hasAttributes(String[] splited) {
        return splited.length > 1;
    }

    void addToEncodedString(String key) {
        if (match.containsKey(key)) {
            int encoded = match.get(key);
            encodedString.add(String.valueOf(encoded));
        }
        else {
            match.put(key, index);
            encodedString.add(String.valueOf(index));
            index++;
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
