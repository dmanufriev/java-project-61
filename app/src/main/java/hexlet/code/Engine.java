package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    private Scanner scanner;
    private String playerName;
    private final int maxNumCorrectAnswers = 3;

    public Engine(Scanner sc) {
        scanner = sc;
        playerName = "";
    }

    private void getPlayerName() {
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
    }

    private void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    private String getAnswer() {
        System.out.print("Your answer: ");
        return scanner.next();
    }

    public final void startGame(Game game) {

        System.out.println("Welcome to the Brain Games!");
        getPlayerName();
        System.out.println(game.getRules());

        for (int i = 0; i < maxNumCorrectAnswers; i++) {
            String[] data = game.getData();
            askQuestion(data[0]);
            String answer = getAnswer();
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
