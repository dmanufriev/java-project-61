package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private static final int MIN_RANDOM = 1;
    private static final int MAX_RANDOM = 30;
    private static Random random = new Random();

    private int getGCD(int firstNum, int secondNum) {
        int rest = firstNum % secondNum;
        if (rest == 0) {
            return secondNum;
        }
        return getGCD(secondNum, rest);
    }

    @Override
    public final String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public final String[] getData() {

        int firstNum = random.nextInt(MIN_RANDOM, MAX_RANDOM);
        int secondNum = random.nextInt(MIN_RANDOM, MAX_RANDOM);

        String[] data = new String[DATA_SIZE];
        data[QUESTION] = firstNum + " " + secondNum;
        data[CORRECT_ANSWER] = String.valueOf(getGCD(firstNum, secondNum));

        return data;
    }
}
