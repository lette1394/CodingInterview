package HackerRank;

public class Equal {

    static int equal(int[] cookies, int minValue) {

        int result = Integer.MAX_VALUE;
        for (int base = 0; base < 3; base++) {
            int current = 0;
            for (int i = 0; i < cookies.length; i++) {
                current += countBestJump(cookies[i], minValue, base);
            }
            result = Math.min(current, result);
        }

        return result;
    }

    private static int countBestJump(int value, int minValue, int base) {
        int temp = value - (minValue - base);

        return (temp / 5) + (temp % 5 / 2) + (temp % 5 % 2);
    }
}
