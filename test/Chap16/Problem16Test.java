package Chap16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem16Test {
    int[] input;
    int[] input2;
    int[] input3;
    Problem16 p = new Problem16();

    public void parse() {
        input = new int[] {1,2,3,4,5,7,6,8,9,10};
        input2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        input3 = new int[] {1,2,4,7,10,11,7,12,6,7,16,18,19};
    }

    @Test
    public void main() {
        parse();
        assertArrayEquals(new int[] {5, 6}, p.getIndex(input));
        assertArrayEquals(new int[] {-1, -1}, p.getIndex(input2));
        assertArrayEquals(new int[] {3, 9}, p.getIndex(input3));
    }
}
