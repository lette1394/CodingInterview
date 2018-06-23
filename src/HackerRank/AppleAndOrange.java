package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AppleAndOrange {
    static int start, end, appleTree, OrangeTree;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        /*
            s Starting point of Sam's house location.
            t Ending location of Sam's house location.
            a Location of the Apple tree.
            b Location of the Orange tree.
            m Number of apples that fell from the tree.
            apples Distance at which each apple falls from the tree.
            n Number of oranges that fell from the tree.
            oranges Distance at which each orange falls from the tree.
         */
        int appleNumber, orangeNumber;
        int[] appleLocations, orangeLocations;

        String[] input = in.readLine().split(" ");
        start = Integer.parseInt(input[0]);
        end = Integer.parseInt(input[1]);

        input = in.readLine().split(" ");
        appleTree = Integer.parseInt(input[0]);
        OrangeTree = Integer.parseInt(input[1]);

        input = in.readLine().split(" ");
        appleNumber = Integer.parseInt(input[0]);
        orangeNumber = Integer.parseInt(input[1]);

        input = in.readLine().split(" ");
        appleLocations = new int[appleNumber];
        for (int i = 0; i < appleNumber; i++) {
            appleLocations[i] = Integer.parseInt(input[i]);
        }

        input = in.readLine().split(" ");
        orangeLocations = new int[orangeNumber];
        for (int i = 0; i < orangeNumber; i++) {
            orangeLocations[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solve(appleLocations, orangeLocations));
    }

    private static String solve(int[] aL, int[] oL) {

        return Arrays.toString(aL) + Arrays.toString(oL);
    }

    private boolean isAppleIn(int location) {
        return true;
    }
}