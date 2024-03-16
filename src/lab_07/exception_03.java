package lab_07;

import java.util.Scanner;

// Custom exception class for negative numbers
class NegativeNumberException extends Exception {
  public NegativeNumberException(String message) {
    super(message);
  }
}

// Class with a method to process user input
public class exception_03 {
  // Method to process user input
  public static void ProcessInput() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = in.nextInt();

    try {
      if (a < 0) {
        throw new NegativeNumberException("Entered number is negative!");
      } else {
        double result = a * 2.0;
        System.out.println("Double value of the entered number: " + result);
      }
    } catch (NegativeNumberException e) {
      System.out.println("Error: " + e.getMessage());
    }
    finally {
      System.out.println("Hi Souradip!");
    }
  }

  public static void main(String[] args) {
    ProcessInput();
  }
}
