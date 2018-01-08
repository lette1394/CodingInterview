package Chap16;

public class Problem8 {


    public String parse(int number) {


        return "";


    }

    public int[] getEachValues(int originNumber) {
        int[] placeValue = new int[getPlaceValue(originNumber)];
        int number;
        int dividedNumber = originNumber;


        for (int i = placeValue.length-1; i >= 0 ; i--) {
            number = dividedNumber % 10;
            dividedNumber = dividedNumber / 10;

            placeValue[i] = number;
        }

        return placeValue;
    }

    public int getPlaceValue(int number) {
        int count = 0;
        int devidedNumber = number;

        if (devidedNumber == 0) {
            return 1;
        }

        while(devidedNumber != 0) {
            devidedNumber = devidedNumber / 10;
            count++;
        }

        return count;
    }
}
