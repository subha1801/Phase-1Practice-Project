package methods;

public class MethodOverload {
	
	public void calculate(int b,int h)
    {
         System.out.println("Area of rectangle "+(b*h));
    }
    
	public void calculate(int l) 
    {
         System.out.println("Area of Circle : "+(3.14*l*l));
    }
	
	public void calculate(float g,int c)
	{
		System.out.println("add "+ (g+c));
	}
	public void calculate(double sq)
	{
		 System.out.println("Area of square "+(sq*sq));
	}
    public static void main(String args[])
    {
      MethodOverload ob=new MethodOverload();
      ob.calculate(10.0f,12);
      ob.calculate(5,6);
      ob.calculate(5);
      ob.calculate(7.5);
    }
}
