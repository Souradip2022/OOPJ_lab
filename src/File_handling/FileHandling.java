package File_handling;
import java.io.*;

public class FileHandling {
  public static void main(String[] args) {
    try{
      BufferedWriter fw = new BufferedWriter(new FileWriter("random.txt"));
      fw.write("\nHi Souradip\n");
      fw.close();
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }

    try{
      BufferedReader br = new BufferedReader(new FileReader("random.txt"));
      while(br.ready()){
        System.out.println(br.readLine());
      }
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
