package Chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem4 {

    int[][] grid;

    public void setGrid() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        StringTokenizer token = new StringTokenizer(reader.readLine());
        int size = token.countTokens();

        grid = new int[size][size];

        while (reader.ready()) {
            token = new StringTokenizer(reader.readLine());
            while (token.hasMoreTokens()) {
                int from = token.nextToken().toCharArray()[0] - 'a';
                int to = token.nextToken().toCharArray()[0] - 'a';
                grid[from][to] = 1;
            }
        }
    }





}
