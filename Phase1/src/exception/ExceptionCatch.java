package exception;

public class ExceptionCatch {
    public static void main(String[] args) {  
        try  
        {  
        int x=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("remaining code");  
    }  
      
}  