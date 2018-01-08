package Chap16;

import org.junit.Before;
import org.junit.Ignore;
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

    @Ignore
    @Test
    public void finalTest() {
        assertEquals("1 2 McDowell 3 CA 0 2 3 Gayle 0 Some Message 0 0", p10.getEncodedXML());
    }

    @Test
    public void regexString() {
        assertEquals(new String[] {"family", "lastname=McDowell", "state=CA"}, p10.getTagsWithAttributes());
    }


}
