package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static Scanner scanner;
    private static String playerName;
    private static final int maxNumCorrectAnswers = 3;
    private static int numCorrectAnswers = 0;

    public static void init(Scanner sc) {
        scanner = sc;
        playerName = "";
        numCorrectAnswers = 0;
    }

    public static void greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
    }

    public static void askQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        return scanner.next();
    }

    public static int checkAnswer(String answer, String correctAnswer) {

        if (!answer.equals(correctAnswer)) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            return -1;
        }

        System.out.println("Correct!");
        if (++numCorrectAnswers >= maxNumCorrectAnswers) {
            System.out.println("Congratulations, " + playerName + "!");
            numCorrectAnswers = 0;
            return 0;
        }

        return 1;
    }



}
