import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game l = new Game();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Mastermind! You have 10 tries to guess the correct number.");
        for (int count = 0; count<15; count++) {
            System.out.print("Enter your guess (4 digit number): ");
            int userNumber = s.nextInt();
            System.out.println(l.determineCorrect(userNumber));
            if (l.info() == userNumber) {
                System.out.println("You got it!");
            } else if (count < 14) {
                System.out.println("Try again");
            } else {
                System.out.println("You lost! the number was " + l.info());
            }
        }

    }
}

