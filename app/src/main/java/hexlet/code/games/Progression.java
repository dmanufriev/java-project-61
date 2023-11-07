package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    private final int maxStart = 100;
    private final int minLength = 5;
    private final int maxLength = 15;
    private final int minStep = 1;
    private final int maxStep = 25;
    private Random random;

    public Progression() {
        random = new Random();
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getData() {

        int start = random.nextInt(maxStart);
        int length = random.nextInt(minLength, maxLength);
        int step = random.nextInt(minStep, maxStep);
        int hiddenNum = random.nextInt(length);

        String progression = "";
        for (int i = 0; i < length; i++) {
            if (i == hiddenNum) {
                progression += ".. ";
            } else {
                progression += (start + i * step) + " ";
            }
        }

        String[] data = new String[2];
        data[0] = progression;
        data[1] = String.valueOf(start + step * hiddenNum);

        return data;
    }
}
