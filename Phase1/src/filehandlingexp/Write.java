package filehandlingexp;

import java.io.File;
import java.io.FileWriter;

public class Write {
  public static void main(String args[]) {

    String data = "Write this data";
    
    try {
      
      FileWriter output = new FileWriter("D:\\myFile.txt");
      output.write(data);
      System.out.println("Data is written to the file.");

      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 }
}