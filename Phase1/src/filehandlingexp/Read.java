package filehandlingexp;
import java.io.File;
import java.io.FileReader;

public class Read{
  public static void main(String[] args) {

    char[] array = new char[60];
    
    try {
      
      FileReader input = new FileReader("D:\\myFile.txt");
     
      input.read(array);
      
      System.out.println("Data in the file:");
      System.out.println(array);
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}