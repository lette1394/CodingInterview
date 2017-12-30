package Java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncExam {
    public static String processFiles(ProcessFileProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("resources/data.txt"))) {
            return p.process(br);
        }
    }

    public static String readEntireTxt(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();

        while(br.ready()) {
            sb.append(br.readLine());
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(processFiles(FuncExam::readEntireTxt));
    }
}

@FunctionalInterface
interface ProcessFileProcessor {
    String process(BufferedReader br) throws IOException;
}

