package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int MAX_RANDOM = 100;

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void run() {
        String answer = "";
        String correctAnswer = "";

        Engine.greetPlayer();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Random random = new Random();
        do {
            int questionNum = random.nextInt(MAX_RANDOM);
            Engine.askQuestion(String.valueOf(questionNum));
            answer = Engine.getAnswer();
            correctAnswer = isPrime(questionNum) ? "yes" : "no";
        } while (Engine.checkAnswer(answer, correctAnswer) > 0);
    }
}
