package hexlet.code.games;

import java.util.Random;

public class Prime implements Game {
    private static final int MAX_RANDOM = 100;
    private Random random;

    public Prime() {
        random = new Random();
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public final String[] getData() {

        int questionNum = random.nextInt(MAX_RANDOM);

        String[] data = new String[2];
        data[0] = String.valueOf(questionNum);
        data[1] = isPrime(questionNum) ? "yes" : "no";

        return data;
    }
}
