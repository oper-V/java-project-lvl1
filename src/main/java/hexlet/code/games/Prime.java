package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public final class Prime implements  Games<String> {

    private String answer;
    private String correctAnswer;
    private int number;


    private int countCorrectAnswer;
    private boolean isCorrectAnswer;
    private static final int MAX_NUMBER = 100;

    @Override
    public void start() {
        //printRules();
        getQuestion();
        setAnswer();
        check(number, answer);

    }

    public void printRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
                if(isPrime(x)) {
                    isCorrectAnswer = true;
                    countCorrectAnswer++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "no";
                }
                break;
            case "no":
                if (!isPrime(x)) {
                    isCorrectAnswer = true;
                    countCorrectAnswer++;
                } else {
                    isCorrectAnswer = false;
                    correctAnswer = "yes";
                }
                break;
            default:
                isCorrectAnswer = false;
                if(isPrime(x)) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                break;
        }
    }



    private  boolean isPrime(int n) {
        if (n < 2) { return false; }
        double s = (int) Math.sqrt(n);
        for (int j = 2; j <= s; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }
}
