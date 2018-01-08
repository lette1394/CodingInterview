package Chap16;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class Problem12Test {
    Problem12 p10;

    @Before
    public void before() throws FileNotFoundException {
        this.p10 = new Problem12();
    }

    @Test
    public void stream() throws IOException {
        assertEquals("<family lastname=\"McDowell\" state=\"CA\">", p10.getOneLine());
    }
}
