package HackerRank;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PasswordCrackerTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void simulate(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @Test
    public void main() throws Exception {
        String input = "3\n" +
                "6\n" +
                "because can do must we what\n" +
                "wedowhatwemustbecausewecan\n" +
                "2\n" +
                "hello planet\n" +
                "helloworld\n" +
                "3\n" +
                "ab abcd cd\n" +
                "abcd";

        String answer = "we do what we must because we can\n" +
                "WRONG PASSWORD\n" +
                "ab cd\n";

        simulate(input);
        PasswordCracker.main(null);
        assertEquals(answer, out.toString());
    }

    @Test
    public void main2() throws Exception {
        String input = "3\n" +
                "4\n" +
                "ozkxyhkcst xvglh hpdnb zfzahm\n" +
                "zfzahm\n" +
                "4\n" +
                "gurwgrb maqz holpkhqx aowypvopu\n" +
                "gurwgrb\n" +
                "10\n" +
                "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa aaaaaaaaa aaaaaaaaaa\n" +
                "aaaaaaaaaab";

        String answer = "zfzahm\n" +
                "gurwgrb\n" +
                "WRONG PASSWORD\n";

        simulate(input);
        PasswordCracker.main(null);
        assertEquals(answer, out.toString());
    }

    @Test
    public void main3() throws Exception {
        String input = "3\n" +
                "4\n" +
                "helloworld hello world helloevery\n" +
                "helloeveryworld\n" +
                "4\n" +
                "gurwgrb maqz holpkhqx aowypvopu\n" +
                "gurwgrb\n" +
                "10\n" +
                "a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa aaaaaaaaa aaaaaaaaaa\n" +
                "aaaaaaaaaab";

        String answer = "helloevery world\n" +
                "gurwgrb\n" +
                "WRONG PASSWORD\n";

        simulate(input);
        PasswordCracker.main(null);
        assertEquals(answer, out.toString());
    }
}

