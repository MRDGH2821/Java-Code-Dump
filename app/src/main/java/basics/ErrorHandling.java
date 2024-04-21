package basics;

/**
 * Basics of Error Handling.
 *
 * @class ErrorHandling
 */
public class ErrorHandling {
  /** Demonstrates error handling. */
  public static void main(String[] args) {

    try {
      int num1 = 2;
      int num2 = 0;
      int result = num1 / num2;
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("You cannot divide by zero!");
    }
  }
}
