//Find the no. of occurrence of each element in a user entered list of nos.
package lab_02;

import java.util.Scanner;

public class Occurance {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i, n, count;
    int count2 = 0;
    System.out.print("Enter number of elements: ");
    n = in.nextInt();
    Integer arr[] = new Integer[n];
    System.out.print("List of elements: ");
    for (i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    Integer arrRepeat[] = new Integer[n];
    //System.out.println(arrRepeat.length);
    for (i = 0; i < n; i++) {
      int elem = arr[i];
      count = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] == elem) {
          count++;
        }
      }
      if (arrRepeat[0] == null) {
        arrRepeat[count2] = elem;
        count2++;
        System.out.println("Occurrence of element " + elem + " is " + count);
      } else {
        for (int k = 0; k < count2; k++) {
          if (arrRepeat[k] == elem) {
            break;
          }
          arrRepeat[count2] = elem;
          count2++;
          System.out.println("Occurrence of element " + elem + " is " + count);
        }
      }
    }
  }
}
