package filehandlingexp;



import java.io.File;
import java.io.IOException;
public class CreateFile {
  public static void main(String[] args) {
    try {
      File file = new File("D:\\newfile.txt");
      boolean flag = file.createNewFile();
      if (flag) {
        System.out.println("File has been created successfully at the specified location");
      }
      else {
        System.out.println("File already present at the specified location");
      }
    }
    catch(IOException e) {
      System.out.println("Exception Occurred:");
      e.printStackTrace();
    }
  }
}