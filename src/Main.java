import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game l = new Game();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Mastermind!");
        System.out.print("Enter your guess (4 digit number): ");
        int userNumber = s.nextInt();
        System.out.println(l.determineWinnings(userNumber));
    }
}

