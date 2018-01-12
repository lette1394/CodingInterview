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

    @Test
    public void main() {
        String[] str = new String[] {
                "at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""
        };
        assertEquals(4, p5.sparseSearch("ball", str));
    }

    @Test

}
