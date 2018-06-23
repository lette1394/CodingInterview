package HackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerrankCity {

    static int hackerrankCity(int[] A) {


        return 0;
    }


    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);

        int ACount = Integer.parseInt(scanner.nextLine().trim());
        int[] A = new int[ACount];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < ACount; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }
        int result = hackerrankCity(A);

        System.out.println(result);
    }


}
