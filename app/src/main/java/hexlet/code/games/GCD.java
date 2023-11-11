package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private static final int MIN_RANDOM = 1;
    private static final int MAX_RANDOM = 30;
    private Random random;

    public GCD() {
        random = new Random();
    }

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

        String[] data = new String[2];
        data[0] = firstNum + " " + secondNum;
        data[1] = String.valueOf(getGCD(firstNum, secondNum));

        return data;
    }
}
