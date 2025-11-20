import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game l = new Game();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Mastermind! You have 15 tries to guess the correct number.");
        int guess = 0;
        for (int count = 0; count<15; count++) {
            System.out.print("Enter your guess (4 digit number): ");
            int userNumber = s.nextInt();
            System.out.println(l.determineCorrect(userNumber));
            guess ++;
            if (l.info() == userNumber) {
                System.out.println("You got it! It took you " + guess + " guesses.");
            } else if (count < 14) {
                System.out.println("Try again");
            } else {
                System.out.println("You lost! the number was " + l.info());
            }
        }

    }
}

