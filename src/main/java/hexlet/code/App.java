package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Games;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    //int i;
    String choice;
    Scanner read = new Scanner(System.in);

    System.out.println("Please enter the game number and press Enter.");
    System.out.print(" 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - GCD \n "
            + "5 - Progression \n 0 - Exit \n Your choice: ");
     choice = read.nextLine();
    Engine engine = new Engine();
    Games game;
    //Engine.runGames(choice);

    switch (choice) {
      case "0":
        System.out.println("Exit");
        break;
      case "1":
        engine.greet();
        break;
      case "2":
        game = new Even();
        engine.runGames(game);
        break;
      case "3":
        game = new Calc();
        engine.runGames(game);
        break;
      case "4":
        game = new GCD();
        engine.runGames(game);
        break;
      case "5":
        game = new Progression();
        engine.runGames(game);
        break;

      default:
        break;
    }

  }
}

