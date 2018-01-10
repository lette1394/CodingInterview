package Chap16;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Problem12Test {
    Problem12 p10;

    @Before
    public void before() throws FileNotFoundException {
        this.p10 = new Problem12();
    }

    @Test
    public void IO() throws IOException {
        assertEquals('<', p10.getOneChar());
    }

    @Test
    public void readOneElement() throws EOFException {
        assertEquals("family lastname=\"McDowell\" state=\"CA\"", p10.readElement());
        assertEquals("person firstName=\"Gayle\"", p10.readElement());
        assertEquals("/person", p10.readElement());
        assertEquals("/family", p10.readElement());
    }

    @Test
    public void getAttributes() {
        assertEquals("lastname", p10.getAttribute("lastname=McDowell"));
        assertEquals("state", p10.getAttribute("state=CA"));
    }

    @Test
    public void removeQuotes() {
        assertEquals("family lastname=McDowell state=CA", p10.removeQuotes("family lastname=\"McDowell\" state=\"CA\""));
        assertEquals("person firstName=Gayle", p10.removeQuotes("person firstName=\"Gayle\""));
    }

    @Test
    public void finalTest() {
        assertEquals("1 2 McDowell 3 CA", p10.parseXML());
    }
}
