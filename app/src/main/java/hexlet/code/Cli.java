package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static String greeting() {
        Scanner sc = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();

        return name;
    }
}
