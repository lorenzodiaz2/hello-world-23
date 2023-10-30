package sdm.hello;

public class Main {
  public static void main(String... args) {
    System.out.println("Hello " + (args.length == 0 ? "stranger" : args[0]) + "!");
  }

}
