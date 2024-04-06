package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    // create and write
    try {
      File fo = new File("new_file.txt");

      if(!fo.exists()){
        if(fo.createNewFile()){
          System.out.println("File created");
        }
        else {
          System.out.println("File creation failed");
        }

      }

      FileWriter fw = new FileWriter("new_file.txt", true);
      fw.write("\nHello World\n");
      fw.write("Hi Souradip");
      fw.close();

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    //create another file and write
    try {
      File fo = new File("random.txt");
      fo.createNewFile();

      if (fo.delete()) {
        System.out.println(fo.getName());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
