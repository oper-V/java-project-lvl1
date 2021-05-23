package hexlet.code;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    //int i;
    String choice;
    Scanner read = new Scanner(System.in);

    System.out.println("Please enter the game number and press Enter.");
    System.out.print(" 1 - Greet \n 2 - Even \n 3 - Calc \n 0 - Exit \n Your choice: ");
    //i = read.nextInt();
    //Engine.runGames(i);
    choice = read.nextLine();
    Engine.runGames(choice);

  }
}

