package hexlet.code.games;

public interface Game {

    String getRules();

    // String[0] - initial data of game
    // String[1] - string with correct answer
    String[] getData();
}
