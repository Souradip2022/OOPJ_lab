package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; // Import Scanner class

public class FetchSortedData {
  public static void main(String[] args) {

    try {
      BufferedReader br = new BufferedReader(new FileReader("sorted_array.txt"));
      String line = "";
      while (br.ready()) {
        line = br.readLine();
      }

      Scanner sc = new Scanner(line); // Create Scanner object for the line
      int[] arr = new int[sc.nextInt()]; // Read array size first (if present)

      int index = 0;
      while (sc.hasNextInt()) { // Check for next integer
        arr[index++] = sc.nextInt();
      }

      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      sc.close(); // Close Scanner after use
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
