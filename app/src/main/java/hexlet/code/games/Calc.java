package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void run() {
        String answer = "";
        final char[] operations = {'+', '-', '*'};
        final int[] operationLimit = {100, 100, 20};
        int operationResult = 0;

        Engine.greetPlayer();
        System.out.println("What is the result of the expression?");

        Random random = new Random();
        do {
            int opNum = random.nextInt(3);
            int firstNum = random.nextInt(operationLimit[opNum]);
            int secondNum = random.nextInt(operationLimit[opNum]);

            Engine.askQuestion(firstNum + " " + operations[opNum] + " " + secondNum);
            answer = Engine.getAnswer();

            switch (operations[opNum]) {
                case '+':
                    operationResult = firstNum + secondNum;
                    break;
                case '-':
                    operationResult = firstNum - secondNum;
                    break;
                default:
                    operationResult = firstNum * secondNum;
                    break;
            }
        } while (Engine.checkAnswer(answer, String.valueOf(operationResult)) > 0);
    }
}
