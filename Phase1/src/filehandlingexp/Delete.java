package filehandlingexp;
import java.io.File;
public class Delete {
  public static void main(String[] args) {
    try {
      File f = new File("D:\\myFile.txt");  
      if (f.delete()) 
      {
        System.out.println("File " + f.getName() + " is deleted"); 
      }
      else {
        System.out.println("Delete operation failed");
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}


