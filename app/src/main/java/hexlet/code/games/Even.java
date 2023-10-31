package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int MAX_RANDOM = 1000;

    public static void run() {
        String answer = "";
        String correctAnswer = "";

        Engine.greetPlayer();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        do {
            int randomNum = random.nextInt(MAX_RANDOM);
            Engine.askQuestion(String.valueOf(randomNum));
            answer = Engine.getAnswer();
            correctAnswer = (randomNum % 2 == 0) ? "yes" : "no";
        } while (Engine.checkAnswer(answer, correctAnswer) > 0);
    }
}
