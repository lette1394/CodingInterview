package HackerRank;

import org.junit.Test;

public class ArrayGameTest {

    @Test
    public void name() throws Exception {
        int[] game = new int[] {0, 0, 0, 0, 0};
        assert(ArrayGame.canWin(3, game));
    }

    @Test
    public void name2() throws Exception {
        int[] game2 = new int[] {0, 0, 1, 1, 1, 0};
        assert(!ArrayGame.canWin(3, game2));
    }

    @Test
    public void name3() throws Exception {
        int[] game2 = new int[] {0, 0, 1, 1, 0, 1, 0};
        assert(ArrayGame.canWin(4, game2));
    }
}
