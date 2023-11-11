package hexlet.code.games;

import java.util.Random;

public class Even implements Game {
    private static final int MAX_RANDOM = 1000;
    private Random random;

    public Even() {
        random = new Random();
    }

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

        String[] data = new String[2];
        data[0] = String.valueOf(randomNum);
        data[1] = isEven(randomNum) ? "yes" : "no";

        return data;
    }
}
