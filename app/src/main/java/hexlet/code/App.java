package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
public class App {
    private static final int GAME_EXIT = 0;
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;

    public static void main(String[] args) {
        int gameNum = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GAME_GREET + " - Greet");
        System.out.println(GAME_EVEN + " - Even");
        System.out.println(GAME_CALC + " - Calc");
        System.out.println(GAME_GCD + " - GCD");
        System.out.println(GAME_EXIT + " - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        try {
            gameNum = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input. Please enter a number 0...2");
            return;
        }

        Engine.init(scanner);
        switch (gameNum) {
            case GAME_GREET:
                Engine.greetPlayer();
                break;
            case GAME_EVEN:
                Even.run();
                break;
            case GAME_CALC:
                Calc.run();
                break;
            case GAME_GCD:
                GCD.run();
                break;
            default:
                break;
        }

        scanner.close();
    }
}
