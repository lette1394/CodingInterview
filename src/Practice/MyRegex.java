package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    public static void test1(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            System.out.println(line.replaceAll("\\s+", "_"));
        }
    }

    public static void test2(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Pattern p = Pattern.compile("^(\\w+)://([\\w._]+):(\\d+)/\\w+/(\\w+)\\.(\\w+)");
            Matcher m = p.matcher(line);

            while (m.find()) {
                for (int i = 1; i <= m.groupCount(); i++) {
                    System.out.print("line" + i + ": ");
                    System.out.println(m.group(i));
                }
            }
        }
    }

    public static void test3(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();

        Pattern p = Pattern.compile("^(?<protocol>\\w+)://(?<url>[\\w._]+):(?<port>\\d+)");
        Matcher m = p.matcher(line);



        while (m.find()) {
            System.out.println(m.group());

            System.out.print("line1: ");
            System.out.println(m.group("protocol"));

            System.out.print("line2: ");
            System.out.println(m.group("url"));

            System.out.print("line3: ");
            System.out.println(m.group("port"));
        }


    }
}
