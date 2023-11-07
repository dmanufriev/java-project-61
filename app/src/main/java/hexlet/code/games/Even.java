package hexlet.code.games;

import java.util.Random;

public class Even implements Game {
    private final int maxRandom = 1000;
    private Random random;

    public Even() {
        random = new Random();
    }

    @Override
    public final String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public final String[] getData() {

        int randomNum = random.nextInt(maxRandom);

        String[] data = new String[2];
        data[0] = String.valueOf(randomNum);
        data[1] = (randomNum % 2 == 0) ? "yes" : "no";

        return data;
    }
}
