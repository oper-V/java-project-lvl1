package hexlet.code;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Brain Games!");

	Cli cli = new Cli();
	cli.read();
	System.out.println("Hello, " + cli.get());
  }
}

