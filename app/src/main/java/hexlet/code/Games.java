package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Games {
    private static String userName;
    private static int numCorrectAnswers = 0;

    public static void greet(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void even(Scanner scanner) {

        greet(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        while (numCorrectAnswers < 3) {
            int randomNum = random.nextInt(1000);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            String correctAnswer = (randomNum % 2 == 0)? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                numCorrectAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
