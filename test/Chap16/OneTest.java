package Chap16;

import org.junit.Test;
import static org.junit.Assert.*;

public class OneTest {

    @Test(timeout = 20)
    public void helloWorld() {
        assertEquals("hello world!", One.ex1());
    }

}


