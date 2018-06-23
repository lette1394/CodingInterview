package Chap16;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem21Test {
    @Test
    public void main() throws Exception {
        int[] arr1 = new int[] {4, 1, 2, 1, 1, 2};
        int[] arr2 = new int[] {3, 6, 3, 3};

        assertArrayEquals(new int[] {1, 3}, Problem21.solve(arr1, arr2));
    }

    @Test
    public void main2() throws Exception {
        int[] arr1 = new int[] {4, 1, 2, 1, 1, 2, 5, 1, 13, 4, 1, 2, 3};
        int[] arr2 = new int[] {3, 6, 3, 3, 7, 4, 1, 5, 5};

        assertArrayEquals(new int[] {1, 2}, Problem21.solve(arr1, arr2));
    }
}
