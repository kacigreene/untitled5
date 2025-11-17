public class Game {
    private int number;

    public Game() {
        int num = (int) ((Math.random() * 9000) + 1000);
        number = num;
    }

    public int info() {
        return number;
    }

    public String determineWinnings(int userNumber) {
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
        if (userNumber == number) {
            return "You got it! The number was " + number;
        }
        if (thousandsDigitUser == thousandsDigitNum) {
            countCorrect++;
        } else if (thousandsDigitUser == hundredsDigitUser) || (thousandsDigitUser == tensDigitNum) || (thousandsDigitUser == onesDigitNum) {
            countAlmost++;
        }
        return "You have " + countCorrect + "numbers in the correct place and " + countAlmost + "correct numbers in the wrong place";
    }
}
