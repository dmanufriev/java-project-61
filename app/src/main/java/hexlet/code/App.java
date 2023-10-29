package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;
public class App {
    private static final int gameExit = 0;
    private static final int gameGreet = 1;
    private static final int gameEven = 2;
    private static final int gameCalc = 3;
    private static final int gameGCD = 4;

    public static void main(String[] args) {
        int gameNum = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(gameGreet + " - Greet");
        System.out.println(gameEven + " - Even");
        System.out.println(gameCalc + " - Calc");
        System.out.println(gameGCD + " - GCD");
        System.out.println(gameExit + " - Exit");
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
            case gameGreet:
                Engine.greetPlayer();
                break;
            case gameEven:
                Even.run();
                break;
            case gameCalc:
                Calc.run();
                break;
            case gameGCD:
                GCD.run();
                break;
            default:
                break;
        }

        scanner.close();
    }
}
