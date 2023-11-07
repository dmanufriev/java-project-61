package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    private final int maxOperationsNum = 3;
    private final char[] operations = {'+', '-', '*'};
    private final int[] operationLimit = {100, 100, 20};
    private Random random;

    public Calc() {
        random = new Random();
    }

    @Override
    public final String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public final String[] getData() {

        int opNum = random.nextInt(maxOperationsNum);
        int firstNum = random.nextInt(operationLimit[opNum]);
        int secondNum = random.nextInt(operationLimit[opNum]);

        int operationResult;
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

        String[] data = new String[2];
        data[0] = firstNum + " " + operations[opNum] + " " + secondNum;
        data[1] = String.valueOf(operationResult);

        return data;
    }
}
