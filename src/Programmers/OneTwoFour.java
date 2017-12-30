package Programmers;


class OneTwoFour {
    public String change124(int value) {
        StringBuilder sb = new StringBuilder();

        for (char ch : toDeposition(value).toCharArray()) {
            if (ch == '1') {
                sb.append('1');
            }
            else if (ch == '2') {
                sb.append('2');
            }
            else if (ch == '3') {
                sb.append('4');
            }
        }

        return sb.toString();
    }

    String toDeposition(int value){
        StringBuilder sb = new StringBuilder();

        int figure = 3;
        int n = getCarry(value);

        while (figure != 0) {
            int temp = (int)(figure * Math.pow(3, n-1));

            if (checkValid(value - temp, n-1)) {
                sb.append(figure);
                value = value - temp;
                n = n - 1;
                figure = 3;
            }
            else {
                figure--;
            }
        }
        return sb.toString();
    }

    boolean checkValid(int value, int n) {
        if (((Math.pow(3, n) - 1) / 2 <= value) && (value <= (Math.pow(3, n) - 1) * 3 / 2)) {
            return true;
        }

        return false;
    }

    int getCarry(int value) {
        int n = 0;

        while(true) {
            if (3 * (Math.pow(3, n)-1)/2 >= value) {
                return n;
            }
            else {
                n++;
            }
        }
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        OneTwoFour oneTwoFour = new OneTwoFour();
        System.out.println(oneTwoFour.change124(100));
    }
}

