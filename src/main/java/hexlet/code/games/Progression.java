package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public final class Progression implements  Games<Integer> {

    private static final int MAX_LENGHT = 10;
    private static final int MIN_LENGHT = 5;
    private static final int MAX_NUMBER = 20;
    private int hiddenPosition;
    private int[] array;
    private int currentLenght;
    private int startNumber;
    private int step;
    private  int answer;
    private  int countCorrectAnswer;
    private  boolean isCorrectAnswer;
    private  int correctAnswer;



    @Override
    public void start() {
        printRules();
        getQuestion();
        setAnswer();
        check(answer);

    }

    private  void printRules() {
        System.out.println("What number is missing in the progression?");
    }

    private  void getQuestion() {
        Random rn = new Random();
        currentLenght = MIN_LENGHT + rn.nextInt(MAX_LENGHT - MIN_LENGHT);
        hiddenPosition = rn.nextInt(currentLenght);
        array = new int[currentLenght];
        startNumber = rn.nextInt(MAX_NUMBER);
        step = rn.nextInt(MAX_NUMBER);


        array[0] = startNumber;
        System.out.println("Question: ");
        // Заполнение массива исходной програссией
        for (int i = 0; i < currentLenght; i++) {
            if (i == 0) {
                array[i] = startNumber;
            } else {
                array[i] = array[0] + i * step;
            }

            if (i == hiddenPosition) {
                System.out.print(".. ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Your answer: ");
    }

    private  void setAnswer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
    }

    private  void check(int inputAnswer) {
        if (array[hiddenPosition] == inputAnswer) {
            isCorrectAnswer = true;
            countCorrectAnswer++;
        } else {
            isCorrectAnswer = false;
            correctAnswer = array[hiddenPosition];
        }
    }

    @Override
    public Integer getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public  boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    @Override
    public  Integer getAnswer() {
        return answer;
    }

    @Override
    public int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }

}
