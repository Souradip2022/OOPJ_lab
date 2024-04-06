package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BubbleSortAndWriteToFile {
  public static void main(String[] args) {
    int[] array = {64, 34, 25, 12, 22, 11, 90};
    bubbleSort(array);
    writeToFile(array);
  }

  // Function to perform bubble sort
  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // swap arr[j+1] and arr[j]
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  // Function to write sorted array into a file
  public static void writeToFile(int[] array) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("sorted_array.txt"));
      for (int i = 0; i < array.length; i++) {
        writer.write(array[i] + " ");
      }
      writer.close();
      System.out.println("Sorted array has been written to sorted_array.txt file successfully.");
    } catch (IOException e) {
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
    }
  }
}