package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int MAX_START = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 25;

    public static void run() {
        String answer = "";
        String correctAnswer = "";

        Engine.greetPlayer();
        System.out.println("What number is missing in the progression?");

        Random random = new Random();
        do {
            int start = random.nextInt(MAX_START);
            int length = random.nextInt(MIN_LENGTH, MAX_LENGTH);
            int step = random.nextInt(MIN_STEP, MAX_STEP);
            int hiddenNum = random.nextInt(length);

            String progression = "";
            for (int i = 0; i < length; i++) {
                if (i == hiddenNum) {
                    progression += " .. ";
                } else {
                    progression += " " + (start + i * step) + " ";
                }
            }
            Engine.askQuestion(progression);
            answer = Engine.getAnswer();
            correctAnswer = String.valueOf(start + step * hiddenNum);
        } while (Engine.checkAnswer(answer, correctAnswer) > 0);
    }
}
