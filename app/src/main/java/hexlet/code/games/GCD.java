package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final int minRandom = 1;
    private final int maxRandom = 30;
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
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] getData() {

        int firstNum = random.nextInt(minRandom, maxRandom);
        int secondNum = random.nextInt(minRandom, maxRandom);

        String[] data = new String[2];
        data[0] = firstNum + " " + secondNum;
        data[1] = String.valueOf(getGCD(firstNum, secondNum));

        return data;
    }
}
