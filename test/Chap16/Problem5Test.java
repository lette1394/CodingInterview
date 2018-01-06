package Chap16;

import org.junit.Test;
import static org.junit.Assert.*;

public class Problem5Test {

    @Test(timeout = 20)
    public void helloWorld() {
        assertEquals("hello world!", Problem5.ex1());
    }


}


