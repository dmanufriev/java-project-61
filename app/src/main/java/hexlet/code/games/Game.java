package hexlet.code.games;

public interface Game {
    int DATA_SIZE = 2;
    int QUESTION = 0;
    int CORRECT_ANSWER = 1;

    String getRules();

    // String[QUESTION] - initial data of game
    // String[CORRECT_ANSWER] - string with correct answer
    String[] getData();
}
