package HackerRank;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        return canWinImpl(leap, game, 0);
    }

    public static boolean canWinImpl(int leap, int[] game, int current) {
        if (current >= game.length) {
            return true;
        }

        if (current < 0 || game[current] != 0) {
            return false;
        }

        game[current] = 1;

        return canWinImpl(leap, game, current+leap) || canWinImpl(leap, game, current+1) || canWinImpl(leap, game, current-1);

    }
}
