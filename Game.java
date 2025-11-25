public class Game {
    private int number;

    public Game() {
        int num = (int) ((Math.random() * 9000) + 1000);
        number = num;
    }

    public int info() {
        return number;
    }

    public String determineCorrect(int userNumber) {
        int countCorrect = 0;
        int countAlmost = 0;
        int thousandsDigitUser = userNumber / 1000;
        int thousandsDigitNum = number / 1000;
        int hundredsDigitUser = (userNumber - (thousandsDigitUser * 1000)) / 100;
        int hundredsDigitNum = (number - (thousandsDigitNum * 1000)) / 100;
        int tensDigitNum = (number - ((hundredsDigitNum * 100) + (thousandsDigitNum * 1000))) / 10;
        int tensDigitUser = (userNumber - ((hundredsDigitUser * 100) + (thousandsDigitUser * 1000))) / 10;
        int onesDigitNum = number - ((hundredsDigitNum * 100) + (thousandsDigitNum * 1000) + (tensDigitNum * 10));
        int onesDigitUser = userNumber - ((hundredsDigitUser * 100) + (thousandsDigitUser * 1000) + (tensDigitUser * 10));

        if (onesDigitNum == onesDigitUser) {
            countCorrect++;
            onesDigitNum = -1;
            onesDigitUser = -2;
        }
        if (tensDigitUser == tensDigitNum) {
            countCorrect++;
            tensDigitNum = -1;
            tensDigitUser = -2;
        }
        if (hundredsDigitUser == hundredsDigitNum) {
            countCorrect++;
            hundredsDigitNum = -1;
            hundredsDigitUser = -2;
        }
        if (thousandsDigitUser == thousandsDigitNum) {
            countCorrect++;
            thousandsDigitNum = -1;
            thousandsDigitUser = -2;
        }

        if (onesDigitUser != -2 && (onesDigitUser == tensDigitNum || onesDigitUser == hundredsDigitNum || onesDigitUser == thousandsDigitNum)) {
            countAlmost++;
            if (onesDigitUser == tensDigitNum) {
                tensDigitNum = -1;
            } else if (onesDigitUser == hundredsDigitNum) {
                hundredsDigitNum = -1;
            } else tensDigitNum = -1;
        }

        if (tensDigitUser != -2 && (tensDigitUser == onesDigitNum || tensDigitUser == hundredsDigitNum || tensDigitUser == thousandsDigitNum)) {
            countAlmost++;
            if (tensDigitUser == onesDigitNum) {
                onesDigitNum = -1;
            } else if (tensDigitUser == hundredsDigitNum) {
                hundredsDigitNum = -1;
            } else thousandsDigitNum = -1;
        }

        if (hundredsDigitUser != -2 && (hundredsDigitUser == onesDigitNum || hundredsDigitUser == tensDigitNum || hundredsDigitUser == thousandsDigitNum)) {
            countAlmost++;
            if (hundredsDigitUser == onesDigitNum) {
                onesDigitNum = -1;
            } else if (hundredsDigitUser == tensDigitNum) {
                tensDigitNum = -1;
            } else thousandsDigitNum = -1;
        }

        if (thousandsDigitUser != -2 && (thousandsDigitUser == onesDigitNum || thousandsDigitUser == tensDigitNum || thousandsDigitUser == hundredsDigitNum)) {
            countAlmost++;
            if (thousandsDigitUser == onesDigitNum) {
                onesDigitNum = -1;
            } else if (tensDigitUser == tensDigitNum) {
                tensDigitNum = -1;
            } else hundredsDigitUser = -1;
        }

        return "You have " + countCorrect + " correct numbers in the correct place and " + countAlmost + " correct numbers in the wrong place";
    }
}


