package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());

        int arrSize = Integer.parseInt(st.nextToken());

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            st = new StringTokenizer(in.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = solve(arr);

        for (int i = 0; i < arrSize; i++) {
            System.out.println(result[i]);
        }
    }


    private static int[] solve(int[] arr) {
        int[] result = new int[arr.length + 10];

        int index = 0;
        for (int e : arr) {
            if (e < 38) {
                result[index++] = e;
                continue;
            }

            result[index++] = e + getRound(e);
        }

        return result;
    }

    private static int getRound(int num) {
        int large = ((num / 5) + 1) * 5 - num;

        return large < 3 ? large : 0;
    }
}
