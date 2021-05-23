package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private static int countCorrectAnswer;
    private static boolean isCorrectAnswer;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_NUMBER_OPERATOR = 3;
    private static int answer;
    private static int correctAnswer;

    private static int firstOperand;
    private static int secondOperand;
    private static char[] operators = {'+', '-', '*'};
    private static char operator;

    public static void start() {
        printRules();
        getQuestion();
        setAnswer();
        check(firstOperand, secondOperand, operator, answer);
        //return isCorrectAnswer;
    }


    private static void printRules() {
        System.out.println("What is the result of the expression?");
    }

    private static void getQuestion() {
        Random rn = new Random();
        firstOperand = rn.nextInt(MAX_NUMBER);
        secondOperand = rn.nextInt(MAX_NUMBER);
        operator = operators[rn.nextInt(MAX_NUMBER_OPERATOR)];
        System.out.println("Question: " + firstOperand + " " + operator + " " + secondOperand);
        System.out.print("Your answer: ");
    }

    private static void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
    }

    private static void check(int x, int y, char operation, int inputAnswer) {
        if (solution(x, y, operation) == inputAnswer) {
            isCorrectAnswer = true;
            countCorrectAnswer++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = solution(x, y, operation);
        }
    }



    private static int solution(int x, int y, char operation) {
        int result = 0;
        switch (operation) {
            case '*':
                result = x * y;
                break;
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            default:
                System.out.println("Error operator");
        }
        return result;
    }

    public static int getCorrectAnswer() {
        return correctAnswer;
    }

    public static boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public static int getAnswer() {
        return answer;
    }

    public static int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }


}
