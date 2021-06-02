package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Games;

public class Engine {

    private  String playerName;
    private  final int LIMIT_CORRECT_ANSWERS = 3;


    private  void setPlayerName() {
        Cli cli = new Cli();
        cli.read();
        playerName = cli.get();
    }

    private String getPlayerName() {
        return playerName;
    }

    void greet() {
        System.out.println("Welcome to the Brain Games!");
        setPlayerName();
        System.out.println("Hello,  " + getPlayerName());
    }

    private void congratulations() {
        System.out.println("Congratulations, " + getPlayerName() + "!");
    }

    public  void runGames(Games typeOfGames) {
        greet();
        do {
            typeOfGames.start();
            if (typeOfGames.isCorrectAnswer()) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + typeOfGames.getAnswer() + "'"
                        + "is wrong answer ;(. Correct answer was '"
                        + typeOfGames.getCorrectAnswer() + "'");
                System.out.println("Let's try again, " + getPlayerName());
            }
        } while (typeOfGames.isCorrectAnswer() & typeOfGames.getCountCorrectAnswer() < LIMIT_CORRECT_ANSWERS);

        if (typeOfGames.isCorrectAnswer() & LIMIT_CORRECT_ANSWERS == typeOfGames.getCountCorrectAnswer()) {
            congratulations();
        }
    }
}
