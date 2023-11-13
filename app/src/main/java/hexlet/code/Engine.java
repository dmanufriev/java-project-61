package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    private static final int MAX_NUM_CORRECT_ANSWERS = 3;
    public static final void startGame(Game game) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(game.getRules());

        for (int i = 0; i < MAX_NUM_CORRECT_ANSWERS; i++) {
            String[] data = game.getData();
            System.out.println("Question: " + data[Game.QUESTION]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(data[Game.CORRECT_ANSWER])) {
                System.out.print("'" + answer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + data[Game.CORRECT_ANSWER] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
