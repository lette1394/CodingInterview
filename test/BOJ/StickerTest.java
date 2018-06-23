package BOJ;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class StickerTest {

    void simulate(String str) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
    }

    @Test
    public void main1() throws Exception {
        String str =
                "5\n" +
                "50 10 100 20 40\n" +
                "30 50 70 10 60";

        simulate(str);
        int[][] arr = Sticker.parseArray();
        assertEquals(260, Sticker.solve(arr));
    }

    @Test
    public void main2() throws Exception {
        String str =
                "7\n" +
                        "10 30 10 50 100 20 40\n" +
                        "20 40 30 50 60 20 80";

        simulate(str);
        int[][] arr = Sticker.parseArray();
        assertEquals(290, Sticker.solve(arr));
    }
}
