package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    private Scanner scanner;
    private String playerName;
    private static final int MAX_NUM_CORRECT_ANSWERS = 3;

    public Engine(Scanner sc) {
        scanner = sc;
        playerName = "";
    }

    public final void startGame(Game game) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(game.getRules());

        for (int i = 0; i < MAX_NUM_CORRECT_ANSWERS; i++) {
            String[] data = game.getData();
            System.out.println("Question: " + data[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(data[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
