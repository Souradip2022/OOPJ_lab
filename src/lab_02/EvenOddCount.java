/* Accept 10 numbers from command line and check how many of them are even and how many are odd.*/

package lab_02;

import java.util.Scanner;

public class EvenOddCount {
  static Integer arr[] = new Integer[10];

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 10 numbers one by one respectively: ");
    int i;
    for (i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    int evenCount = 0, oddCount = 0;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evenCount++;
      } else oddCount++;
    }

    System.out.println("Number of even numbers: " + evenCount);
    System.out.println("Number of odd numbers: " + oddCount);
  }
}
