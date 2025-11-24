import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game l = new Game();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Mastermind! Select your difficulty (easy, medium or hard)");
        int maxGuesses;
        String diff = s.next();
        if (diff.equals("easy")) {
            maxGuesses = 20;
        } else if (diff.equals("medium")) {
            maxGuesses = 15;
        } else
            maxGuesses = 8;
        System.out.println("You have " + maxGuesses + " tries to guess the correct number.");
        int guess = 0;
        for (int count = 0; count<maxGuesses; count++) {
            System.out.print("Enter your guess (4 digit number): ");
            int userNumber = s.nextInt();
            System.out.println(l.determineCorrect(userNumber));
            guess ++;
            if (l.info() == userNumber) {
                System.out.println("You got it! It took you " + guess + " guesses.");
                break;
            } else if (count < 14) {
                System.out.println("Try again");
            } else {
                System.out.println("You lost! the number was " + l.info());
            }
        }
    }
}

