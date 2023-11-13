package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    private static final int MAX_OPERATIONS_NUM = 3;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final int[] OPERATIONS_LIMIT = {100, 100, 20};
    private static Random random = new Random();

    @Override
    public final String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public final String[] getData() {

        int opNum = random.nextInt(MAX_OPERATIONS_NUM);
        int firstNum = random.nextInt(OPERATIONS_LIMIT[opNum]);
        int secondNum = random.nextInt(OPERATIONS_LIMIT[opNum]);

        int operationResult = -1;
        switch (OPERATIONS[opNum]) {
            case '+':
                operationResult = firstNum + secondNum;
                break;
            case '-':
                operationResult = firstNum - secondNum;
                break;
            case '*':
                operationResult = firstNum * secondNum;
                break;
            default:
                System.out.println("Operation " + opNum + " isn't supported");
                System.exit(0);
                break;
        }

        String[] data = new String[DATA_SIZE];
        data[QUESTION] = firstNum + " " + OPERATIONS[opNum] + " " + secondNum;
        data[CORRECT_ANSWER] = String.valueOf(operationResult);

        return data;
    }
}
