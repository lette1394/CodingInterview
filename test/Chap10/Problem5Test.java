package Chap10;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

public class Problem5Test {
    Problem5 p5;

    @Before
    public void before() {
        this.p5 = new Problem5();
    }

    @Ignore
    @Test
    public void main() {
        String[] str = new String[] {
                "at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""
        };
        assertEquals(4, p5.sparseSearch("ball", str, 0, str.length-1));
    }

    @Test
    public void LeftPartition() {
        String[] str = new String[] {
                "abc", "", "cdd", "", ""
        };
        assertEquals(-1, p5.partition("ccc", str, 0, str.length-1));
    }

    @Test
    public void RightPartition() {
        String[] str = new String[] {
                "abc", "", "cdd", "", ""
        };
        assertEquals(1, p5.partition("ddd", str, 0, str.length-1));
    }
}
