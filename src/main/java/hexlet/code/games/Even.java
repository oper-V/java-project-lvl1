package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {

    private static String answer;
    private static String correctAnswer;
    private static int number;



    private static int countCorrectAnswer;
    private static boolean isCorrectAnswer;
    private static final int MAX_NUMBER = 100;

    public static void start() {
        printRules();
        getQuestion();
        setAnswer();
        check(number, answer);
        //return isCorrectAnswer;
    }

    private static void printRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static void getQuestion() {
        Random rn = new Random();
        number = rn.nextInt(MAX_NUMBER);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
    }

    private static void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
    }

    private static void check(int x, String inputAnswer) {
        switch (inputAnswer) {
            case "yes":
                if (x % 2 == 0) {
                    isCorrectAnswer = true;
                    countCorrectAnswer++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "no";
                }
                break;
            case "no":
                if (x % 2 != 0) {
                    isCorrectAnswer = true;
                    countCorrectAnswer++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                }
                break;
            default:
                isCorrectAnswer = false;
                if (x % 2 == 0) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                break;
        }
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public static String getAnswer() {
        return answer;
    }

    public static int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }


    /*
    private static String check(int number, String input) {
        switch (input) {
            case "yes":
                if (number % 2 == 0) {
                    countCorrectAnswer++;
                    return "Correct!";
                } else {
                    isCorrectAnswer = false;
                    return "'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + App.getPlayerName();
                }
            case "no":
                if (number % 2 != 0) {
                    countCorrectAnswer++;
                    return "Correct!";
                } else {
                    isCorrectAnswer = false;
                    return "'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + App.getPlayerName();
                }
            default:
                isCorrectAnswer = false;
                return "'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + App.getPlayerName();
        }
    }

     */
}
