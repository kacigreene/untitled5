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

        System.out.println(thousandsDigitUser + " " + hundredsDigitUser + " " + tensDigitUser + " " + onesDigitUser);
        System.out.println(thousandsDigitNum + " " + hundredsDigitNum + " " + tensDigitNum + " " + onesDigitNum);


        if (thousandsDigitUser == thousandsDigitNum) {
            countCorrect++;
        } else if ((thousandsDigitUser == hundredsDigitNum) || (thousandsDigitUser == tensDigitNum) || (thousandsDigitUser == onesDigitNum)) {
            countAlmost++;
        }
        if (hundredsDigitUser == hundredsDigitNum) {
            countCorrect++;
        } else if ((hundredsDigitUser == tensDigitNum) || (hundredsDigitUser == onesDigitNum)) {
            countAlmost++;
        }
        if (tensDigitUser == tensDigitNum) {
            countCorrect++;
        } else if ((tensDigitUser == onesDigitNum)) {
            countAlmost++;
        }
        if (onesDigitNum == onesDigitUser) {
            countCorrect++;
        }
        return "You have " + countCorrect + " correct numbers in the correct place and " + countAlmost + " correct numbers in the wrong place";
    }
}
