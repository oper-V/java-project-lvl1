package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD implements  Games<Integer>{

    private  int countCorrectAnswer;
    private  boolean isCorrectAnswer;
    private static final int MAX_NUMBER = 20;
    private static final int MAX_NUMBER_OPERATOR = 3;
    private  int answer;
    private  int correctAnswer;

    private  int firstNumber;
    private  int secondNumber;

    @Override
    public void start() {
        printRules();
        getQuestion();
        setAnswer();
        check(firstNumber, secondNumber, answer);

    }

    private  void printRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    private  void getQuestion() {
        Random rn = new Random();
        firstNumber = rn.nextInt(MAX_NUMBER);
        secondNumber = rn.nextInt(MAX_NUMBER);
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        System.out.print("Your answer: ");
    }

    private  void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
    }

    private  void check(int x, int y, int inputAnswer) {
        if (solution(x, y) == inputAnswer) {
            isCorrectAnswer = true;
            countCorrectAnswer++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = solution(x, y);
        }
    }

    public static int solution(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    @Override
    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    @Override
    public Integer getAnswer() {
        return answer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }
}
