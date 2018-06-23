package HackerRank;

import java.util.Scanner;

public class Candies {
    static long candies(int numberOfChildren, int[] rank) {

        int[] candies = new int[numberOfChildren];

        candies[0] = 1;
        int candy = 1;
        for (int i = 1; i < rank.length; i++) {
            if (rank[i-1] < rank[i]) candy++;
            else if (rank[i-1] >= rank[i]) candy = 1;

            candies[i] = candy;
        }

        candy = 1;
        long count = candies[rank.length-1];

        for (int i = rank.length-2; i >= 0; i--) {
            if (rank[i] > rank[i+1]) candy++;
            else if (rank[i] <= rank[i+1]) candy = 1;

            candies[i] = candy > candies[i] ? candy : candies[i];
            count += candies[i];
        }

        return count;
    }

    public static long run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();

        return candies(n, arr);
    }

    public static void main(String[] args) {
        System.out.println(run());
    }
}
