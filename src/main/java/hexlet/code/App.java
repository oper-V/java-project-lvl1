package hexlet.code;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    int i;
    Scanner read = new Scanner(System.in);

    System.out.println("Please enter the game number and press Enter.");
    System.out.print(" 1 - Greet \n 2 - Even \n 0 - Exit \n Your choice: ");
    i = read.nextInt();
    read.hasNextLine();
    //read.close();

    switch (i) {
      case 0:
        System.out.println("Exit");
        break;
      case 1:
        greet();
        break;
      case 2:
        //System.out.println("Even");
        greet();
        Even.start();

      default:
        break;

    }


  }

  private static void greet() {
    System.out.println("Welcome to the Brain Games!");
    Cli cli = new Cli();
    cli.read();
    System.out.println("Hello,  " + cli.get());
  }


}

