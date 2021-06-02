package hexlet.code.games;

public interface Games<T> {
     void start();

     T getCorrectAnswer();

     boolean isCorrectAnswer();

     T getAnswer();

     int getCountCorrectAnswer();

}
