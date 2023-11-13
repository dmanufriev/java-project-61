package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    private static final int GAME_EXIT = 0;
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;

    private static void launchGame(int gameNum) {
        switch (gameNum) {
            case GAME_GREET:
                Cli.greeting();
                break;
            case GAME_EVEN:
                Engine.startGame(new Even());
                break;
            case GAME_CALC:
                Engine.startGame(new Calc());
                break;
            case GAME_GCD:
                Engine.startGame(new GCD());
                break;
            case GAME_PROGRESSION:
                Engine.startGame(new Progression());
                break;
            case GAME_PRIME:
                Engine.startGame(new Prime());
                break;
            case GAME_EXIT:
                break;
            default:
                System.out.println("Incorrect input. Possible values: " + GAME_EXIT + ".." + GAME_PRIME);
                break;
        }
    }

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GAME_GREET + " - Greet");
        System.out.println(GAME_EVEN + " - Even");
        System.out.println(GAME_CALC + " - Calc");
        System.out.println(GAME_GCD + " - GCD");
        System.out.println(GAME_PROGRESSION + " - Progression");
        System.out.println(GAME_PRIME + " - Prime");
        System.out.println(GAME_EXIT + " - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();
        launchGame(gameNum);
        scanner.close();
    }
}
