package Chap4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class Problem4TwoTest {
    Problem4Two p4;

    void simulateSTDIN(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Before
    public void before() {
        p4 = new Problem4Two();
    }

    @Test
    public void parseSTDIN() throws IOException {
        String[][] dependencies = new String[][] {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"}
        };

        String[] project = new String[] {
                "a", "b", "c", "d", "e", "f"
        };

        assertEquals("e f a b d c", p4.solve(project, dependencies));
    }


}
