package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    private static final int MAX_START = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 25;
    private static Random random = new Random();

    @Override
    public final String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public final String[] getData() {

        int start = random.nextInt(MAX_START);
        int length = random.nextInt(MIN_LENGTH, MAX_LENGTH);
        int step = random.nextInt(MIN_STEP, MAX_STEP);
        int hiddenNum = random.nextInt(length);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == hiddenNum) {
                stringBuilder.append(".. ");
            } else {
                stringBuilder.append(start + i * step);
                stringBuilder.append(" ");
            }
        }

        String[] data = new String[DATA_SIZE];
        data[QUESTION] = stringBuilder.toString();
        data[CORRECT_ANSWER] = String.valueOf(start + step * hiddenNum);

        return data;
    }
}
