package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    private static int getGCD(int firstNum, int secondNum) {
        int rest = firstNum % secondNum;
        if (rest == 0)   return secondNum;
        return getGCD(secondNum, rest);
    }

    public static void run() {
        String answer = "";
        String correctAnswer = "";

        Engine.greetPlayer();
        System.out.println("Find the greatest common divisor of given numbers.");

        Random random = new Random();
        do {
            int firstNum = random.nextInt(1, 30);
            int secondNum = random.nextInt(1, 30);

            Engine.askQuestion(firstNum + " " + secondNum);
            answer = Engine.getAnswer();
            correctAnswer = String.valueOf(getGCD(firstNum, secondNum));
        } while (Engine.checkAnswer(answer, correctAnswer) > 0);
    }
}
