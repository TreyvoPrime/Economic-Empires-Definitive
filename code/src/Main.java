import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String starting_decision;
        System.out.println("Welcome to Economic Empires");
        System.out.println("Would you like to start a game. Y/N");
        starting_decision = input.nextLine().toUpperCase().trim();
        if (starting_decision.equals("Y")) {
            System.out.println("Starting game");
        } else {
            System.out.println("Game will not be starting, goodbye.");
        }
    }
}