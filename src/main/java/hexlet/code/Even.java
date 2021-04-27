package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {

    private static String answer;
    private static int countCorrectAnswer;
    private static boolean isCorrectAnswer = true;
    private static final int LIMIT_CORRECT_ANSWERS = 3;
    private static final int MAX_NUMBER = 100;

    public static void start() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (countCorrectAnswer < LIMIT_CORRECT_ANSWERS) {
            if (isCorrectAnswer) {
                round();
            } else {
                break;
            }
        }

        if (isCorrectAnswer) {
            System.out.println("Congratulations, " + App.getPlayerName() + "!");
        }
    }

    private static void round() {
        Random rn = new Random();
        int number = rn.nextInt(MAX_NUMBER);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        System.out.println(check(number, answer));
    }

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
}
