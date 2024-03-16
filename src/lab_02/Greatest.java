// Find the largest among 3 user entered nos. at the command prompt using Java
package lab_02;

import java.util.Scanner;

public class Greatest {
  static int a, b, c;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter 3 numbers: ");
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    if (a > b && a > c) {
      System.out.println(a + " is greatest");
    } else if (b > c && b > a) {
      System.out.println(b + " is greatest");
    } else System.out.println(c + " is greatest");
  }
}
