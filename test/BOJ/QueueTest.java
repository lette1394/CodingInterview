package BOJ;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class QueueTest {
    Queue queue;

    void setSTDIN(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Before
    public void before() {
        queue = new Queue();
    }

    @Ignore
    @Test
    public void STDIN() {
        String input = "hello";
        setSTDIN(input);

    }

    @Test
    public void push() {
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        assertThat(queue.pop(), is(1));
        assertThat(queue.pop(), is(2));
        assertThat(queue.pop(), is(3));
        assertThat(queue.pop(), is(4));
        assertThat(queue.pop(), is(-1));
    }

    @Test
    public void main() {
        String input = "15\n" +
                "push 1\n" +
                "push 2\n" +
                "front\n" +
                "back\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "pop\n" +
                "pop\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "push 3\n" +
                "empty\n" +
                "front";

        setSTDIN(input);

        queue.parseSTDIN();
    }
}
