package Programmers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrintTriangleTest {
    PrintTriangle pt = new PrintTriangle();

    @Test
    public void print() {
        assertEquals("*", pt.printTriangle(1));

        assertEquals("*\n" +
                "**", pt.printTriangle(2));

        assertEquals("*\n" +
                "**\n" +
                "***", pt.printTriangle(3));

        assertEquals("*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****", pt.printTriangle(5));

        assertEquals("*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******", pt.printTriangle(6));
    }
}
