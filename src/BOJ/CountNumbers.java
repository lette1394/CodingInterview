package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class CountNumbers {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String[] numbers = readLine().split("\\s");
        int[] result = new int[10];

        int mul = Stream.of(numbers).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).reduce((a, b) -> (a * b)).getAsInt();
        for (char c : String.valueOf(mul).toCharArray()) {
            result[c - '0']++;
        }

        printArray(result);
    }

    private static String readLine() {
        StringBuilder result = new StringBuilder();
        String line;

        try {
            while ((line = in.readLine()) != null && !line.isEmpty()) {
                result.append(line);
                result.append(" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
