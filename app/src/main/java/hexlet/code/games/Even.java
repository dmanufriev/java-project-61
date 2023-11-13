package hexlet.code.games;

import java.util.Random;

public class Even implements Game {
    private static final int MAX_RANDOM = 1000;
    private static Random random = new Random();

    private boolean isEven(int num) {
        return (num % 2 == 0);
    }

    @Override
    public final String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public final String[] getData() {

        int randomNum = random.nextInt(MAX_RANDOM);

        String[] data = new String[DATA_SIZE];
        data[QUESTION] = String.valueOf(randomNum);
        data[CORRECT_ANSWER] = isEven(randomNum) ? "yes" : "no";

        return data;
    }
}
