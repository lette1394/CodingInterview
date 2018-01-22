package BOJ;

import org.junit.Test;
import static org.junit.Assert.*;

public class KMPfindTest {
    KMPfind k = new KMPfind();

    @Test
    public void boundary() {
        assertArrayEquals(new int[] {0, 0}, k.getDuplicateIndexAndLengthOfPattern("A"));
        assertArrayEquals(new int[] {1, 1}, k.getDuplicateIndexAndLengthOfPattern("AA"));
        assertArrayEquals(new int[] {2, 1}, k.getDuplicateIndexAndLengthOfPattern("ABA"));
    }

    @Test
    public void test() {
        assertArrayEquals(new int[] {4, 2}, k.getDuplicateIndexAndLengthOfPattern("ABCDABD"));
    }
}
