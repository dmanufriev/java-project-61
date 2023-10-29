package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static void run() {
        String answer = "";
        String correctAnswer = "";

        Engine.greetPlayer();
        System.out.println("What number is missing in the progression?");

        Random random = new Random();
        do {
            int start = random.nextInt(0, 100);
            int length = random.nextInt(5, 15);
            int step = random.nextInt(1, 25);
            int hiddenNum = random.nextInt(0, length);

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
