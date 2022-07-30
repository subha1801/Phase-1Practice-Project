package exception;
import java.util.Scanner;
public class CustomExceptions {
    static int add(int n1, int n2) { 
      if (n1 > 280){
         throw new ArithmeticException("N1 is greater than 280 and hence Exception is thrown");
      }else{
         System.out.println("Both parameters are correct");
      }
      return n1+n2;
   }
    
   public static void main(String args[]){       
	   int result=0;
	   Scanner scanner = new Scanner(System.in); 
       
       System.out.println("Enter number 1 : ");
       int n1 = scanner.nextInt();
       
       System.out.println("Enter number 2 : ");
       int n2 = scanner.nextInt();
      
       try{
    	  result =add(n1,n2);
       }
       catch(ArithmeticException ae)
       {
    	   System.out.println(ae.getMessage());
       }
       
       System.out.println("Result is : "+result);
   }
}