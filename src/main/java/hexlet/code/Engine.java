package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Engine {

    private static String playerName;
    private static final int LIMIT_CORRECT_ANSWERS = 3;
//    private static final int MAX_NUMBER = 100;


   // public static void runGames(int typeOfGames) {
      public static void runGames(String typeOfGames) {

        switch (typeOfGames) {
            case "0":
                System.out.println("Exit");
                break;
            case "1":
                greet();
                break;
            case "2":
                greet();
                do {
                    Even.start();
                    if (Even.isCorrectAnswer()) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + Even.getAnswer() + "'"
                                                + "is wrong answer ;(. Correct answer was '"
                                                + Even.getCorrectAnswer() + "'");
                        System.out.println("Let's try again, " + getPlayerName());
                    }
                    congratulations();
                } while (Even.isCorrectAnswer() & Even.getCountCorrectAnswer() < LIMIT_CORRECT_ANSWERS);
                break;
            case "3":
                //Engine.start(typeOfGames);
                greet();
                do {
                    Calc.start();
                    if (Calc.isCorrectAnswer()) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + Calc.getAnswer() + "'"
                                                + "is wrong answer ;(. Correct answer was '"
                                                + Calc.getCorrectAnswer() + "'");
                        System.out.println("Let's try again, " + getPlayerName());
                    }
                    congratulations();
                } while (Calc.isCorrectAnswer() & Calc.getCountCorrectAnswer() < LIMIT_CORRECT_ANSWERS);
                break;
            default:
                break;

        }

    }


    public static java.lang.String getPlayerName() {
        return playerName;
    }

    private static void greet() {
        System.out.println("Welcome to the Brain Games!");
        setPlayerName();
        System.out.println("Hello,  " + getPlayerName());
    }

    private static void congratulations() {
        if (Even.isCorrectAnswer() & LIMIT_CORRECT_ANSWERS == Even.getCountCorrectAnswer()) {
            System.out.println("Congratulations, " + getPlayerName() + "!");
        } else if (Calc.isCorrectAnswer() & LIMIT_CORRECT_ANSWERS == Calc.getCountCorrectAnswer()) {
            System.out.println("Congratulations, " + getPlayerName() + "!");
        }
    }

    private static void setPlayerName() {
        Cli cli = new Cli();
        cli.read();
        playerName = cli.get();
    }
}
