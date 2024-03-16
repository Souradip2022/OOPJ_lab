package lab_07;

import java.util.Scanner;

public class Exception_01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try {
      int n;
      System.out.print("Enter no of elements in the array: ");
      n = in.nextInt();
      Integer arr[] = new Integer[n];
      System.out.println("Enter elements  of array: ");
      for (int i = 0; i < 4; i++) {
        arr[i] = in.nextInt();
      }
      System.out.println(arr[5]);
      /*int arr1[] = {1, 2, 3};
      System.out.println(arr1[3]);*/
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Hello Souardip!");
    }
  }
}
