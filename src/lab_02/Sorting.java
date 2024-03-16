//Program to sort the user entered list of numbers of any size
package lab_02;

import java.util.Scanner;

public class Sorting {
  static Integer arr[];

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i, j, n;
    System.out.print("Enter number of elements: ");
    n = in.nextInt();
    arr = new Integer[n];

    System.out.println("Enter values one by one");
    for (i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    int minIndex, temp;
    for (i = 0; i < n - 1; i++) {
      minIndex = i;
      for (j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          temp = arr[j];
          arr[j] = arr[minIndex];
          arr[minIndex] = temp;
        }
      }
    }

    System.out.println("Sorted list");
    for (i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
