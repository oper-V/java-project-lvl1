package hexlet.code;

import java.util.Scanner;


public class Cli {

    private static String name;

    public static void read() {
    Scanner sc = new Scanner(System.in);
    System.out.print("May I have your name? ");
    name = sc.nextLine();
    //sc.close();

    }

    public static String get() {
    return name;
    }

}


