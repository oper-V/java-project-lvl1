package hexlet.code.games;

public interface Games {
     void start();

     void printRules();

     void getQuestion() ;

     void setAnswer() ;

     void check();

     String getCorrectAnswer();

     boolean isCorrectAnswer();

     String getAnswer();

     int getCountCorrectAnswer();

}
