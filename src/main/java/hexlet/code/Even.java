package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {

    private static String answer;


    public static void start() {
        Random rn = new Random();


        int number = rn.nextInt(100);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        scanner.close();

        System.out.println(check(number, answer));

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String check(int number, String answer) {
        switch (answer) {
            case "yes":
                if (isEven(number)) {
                    return "Correct!";
                } else {
                    return "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, Bill!";
                }
            case "no":
                if (!isEven(number)) {
                    return "Correct!";
                } else {
                    return "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, Bill!";
                }
            default:
                return "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, Bill!";
        }


    }




}
