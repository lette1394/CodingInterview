package Chap5;

import java.util.Arrays;

public class Problem8 {
    byte[] drawLine(byte[] screen, int width, int x1, int x2, int y) {
        int index1 = x1/8 + width/8*y;
        int offset1 = x1 % 8;
        int index2 = x2/8 + width/8*y;
        int offset2 = x2 % 8;

        System.out.println("before");
        printScreen(screen);

        setAllToOneBetween(screen, index1, offset1, index2, offset2);

        System.out.println();
        System.out.println("after");
        printScreen(screen);

        return screen;
    }

    private void setAllToOneBetween(byte[] screen, int index1, int offset1, int index2, int offset2) {
        byte startMask = (byte)(-1 >>> 8-offset1);
        screen[index1] |= startMask;

        byte endMask = (byte)(-1 << 8-offset2);
        screen[index2] |= endMask;

        for (int i = index1+1; i < index2-1; i++) {
            setOne(screen, i);
        }
    }

    private void setOne(byte[] screen, int index) {
        screen[index] = Byte.parseByte("-1");
    }

    private void printScreen(byte[] screen) {
        for (byte b : screen) {
            System.out.print(Integer.toBinaryString(b) + ' ');
        }
    }
}
