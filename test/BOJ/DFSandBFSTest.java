package BOJ;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class DFSandBFSTest {
    DFSandBFS d;

    @Before
    public void before() {
        simulate();
        d = new DFSandBFS();
    }

    public void simulate() {
        String input = "4 5 1\n" +
                "1 2\n" +
                "1 3\n" +
                "1 4\n" +
                "2 4\n" +
                "3 4";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void DFS() {
        assertThat(d.DFS(), is("1 2 4 3"));
        assertThat(d.BFS(), is("1 2 3 4"));
        assertThat(d.BFS(), is("1 2 3 4"));

    }


    @Test
    public void BFS() {
        assertThat(d.BFS(), is("1 2 3 4"));
        assertThat(d.DFS(), is("1 2 4 3"));
        assertThat(d.DFS(), is("1 2 4 3"));

    }


}
