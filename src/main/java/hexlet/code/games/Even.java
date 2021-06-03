package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public final class Even implements  Games<String> {

    private String answer;
    private String correctAnswer;
    private int number;


    private int countCorrectAnswer;
    private boolean isCorrectAnswer;
    private static final int MAX_NUMBER = 100;

    public void start() {
        getQuestion();
        setAnswer();
        check(number, answer);
    }

    public void printRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private void getQuestion() {
        Random rn = new Random();
        number = rn.nextInt(MAX_NUMBER);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
    }

    private void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
    }

    private void check(int x, String inputAnswer) {
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

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }
}

