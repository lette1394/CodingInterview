package Chap16;

public class Problem8 {


    public String parse(int number) {
        StringBuilder sb = new StringBuilder();
        int[] placeValue = getEachValues(number);

        for (int place = 0; place < placeValue.length; place++) {
            sb.insert(0, translateNumberToEnglish(placeValue[place], place+1));
        }

        return sb.toString().trim();
    }

    public String translateNumberToEnglish(int placeValue, int place) {

        switch (place) {
            case 1:
                return getZeroToNine(placeValue);
            case 2:
                return getMultipleOfTen(placeValue);
            case 3:
                return getZeroToNine(placeValue) + "Hundred";
        }

        return "OUT OF REACH";
    }

    private String getMultipleOfTen(int placeValue) {
        switch (placeValue) {
            case 0:
                return "";
            case 1:
                return getTenToNineteen(placeValue);
            case 2:
                return "Twenty" + getZeroToNine(placeValue);
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
        }

        return "ERROR";
    }

    private String getTenToNineteen(int placeValue) {
        switch (placeValue) {
            case 0:
                return "Ten";
            case 1:
                return "Eleven";
            case 2:
                return "Twelve";
            case 3:
                return "Thirteen";
            case 4:
                return "Fourteen";
            case 5:
                return "Fifteen";
            case 6:
                return "Sixteen";
            case 7:
                return "Seventeen";
            case 8:
                return "Eighteen";
            case 9:
                return "Nineteen";
        }

        return "ERROR";
    }

    private String getZeroToNine(int placeValue) {
        switch (placeValue) {
            case 0:
                return " Zero";
            case 1:
                return " One";
            case 2:
                return " Two";
            case 3:
                return " Three";
            case 4:
                return " Four";
            case 5:
                return " Five";
            case 6:
                return " Six";
            case 7:
                return " Seven";
            case 8:
                return " Eight";
            case 9:
                return " Nine";
        }

        return "ERROR";
    }


    public int[] getEachValues(int originNumber) {
        int[] placeValue = new int[countPlaceValue(originNumber)];
        int number;
        int dividedNumber = originNumber;


        for (int i = 0; i < placeValue.length ; i++) {
            number = dividedNumber % 10;
            dividedNumber = dividedNumber / 10;

            placeValue[i] = number;
        }

        return placeValue;
    }

    public int countPlaceValue(int number) {
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
