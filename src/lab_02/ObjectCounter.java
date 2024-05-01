//Program to find no. of objects created out of a class using ‘static’ modifier.
package lab_02;
import java.util.Scanner;

public class ObjectCounter {
  static int count = 0;

  public ObjectCounter() {
    count++;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Enter no. of to be created: ");
    n = in.nextInt();
    ObjectCounter obj[] = new ObjectCounter[n];

    for (int i = 0; i < n; i++) {
      obj[i] = new ObjectCounter();
    }

    System.out.println("Total no of objects created: " + count);
  }
}
