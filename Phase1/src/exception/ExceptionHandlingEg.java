package exception;

public class ExceptionHandlingEg {
	public static void main(String[] args){
		int num1,num2,num3;
		num1=60;
		num2=90;
		
		try{
		  num3 = num1/num2;
		  System.out.println("Result is "+num3);		  
		}	
		catch(ArithmeticException ae){  // child
			System.out.println("Numbers cannot be divided by zero");
		}
		catch(Exception ae1) // parent
		{
			System.out.println("i am before the subclass exception");
		}
		finally
		{
			System.out.println(" this block is always executed");
		}
		
	num3=num1+num2;               
	System.out.println("Result after addition is "+num3);
	}
}	
