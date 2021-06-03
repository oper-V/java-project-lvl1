package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public final class Calc implements  Games<Integer> {


    private  int countCorrectAnswer;
    private  boolean isCorrectAnswer;
    private static final int MAX_NUMBER = 20;
    private static final int MAX_NUMBER_OPERATOR = 3;
    private  int answer;
    private  int correctAnswer;

    private  int firstOperand;
    private  int secondOperand;
    private  char[] operators = {'+', '-', '*'};
    private  char operator;

    public  void start() {
        getQuestion();
        setAnswer();
        check(firstOperand, secondOperand, operator, answer);
    }


    public  void printRules() {
        System.out.println("What is the result of the expression?");
    }

    private  void getQuestion() {
        Random rn = new Random();
        firstOperand = rn.nextInt(MAX_NUMBER);
        secondOperand = rn.nextInt(MAX_NUMBER);
        operator = operators[rn.nextInt(MAX_NUMBER_OPERATOR)];
        System.out.println("Question: " + firstOperand + " " + operator + " " + secondOperand);
        System.out.print("Your answer: ");
    }

    private  void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
    }

    private  void check(int x, int y, char operation, int inputAnswer) {
        if (solution(x, y, operation) == inputAnswer) {
            isCorrectAnswer = true;
            countCorrectAnswer++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = solution(x, y, operation);
        }
    }



    private  int solution(int x, int y, char operation) {
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


    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    public  boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public  Integer getAnswer() {
        return answer;
    }

    public int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }



}
